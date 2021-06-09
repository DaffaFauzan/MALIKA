'use strict';

const firebase = require('../db');
const Profile = require('../models/profile');
const firestore = firebase.firestore();

const addProfile = async(req,res) =>{
    try {
        const data = req.body;
        await firestore.collection('profiles').doc().set(data);
        res.send('Record Saved Successfully');
    } catch (error) {
        res.status(400).send(error.message);
    }
}

const getAllProfiles = async(req,res) => {
    try {
        const profiles = await firestore.collection('profiles');
        const data = await profiles.get();
        const profilesArray = [];
        if (data.empty) {
            res.status(404).send('No profiles record found');
        } else {
            data.forEach(doc => {
                const profile = new Profile(
                    doc.id,
                    doc.data().name,
                    doc.data().picture,
                    doc.data().address,
                    doc.data().email,
                    doc.data().phone
                );
                profilesArray.push(profile);
            });
            res.send(profilesArray);
        }
    } catch (error) {
        res.status(400).send(error.message);
    
    }
}


const getProfile = async(req,res) =>{
    try {
        const id = req.params.id;
        const profile = await firestore.collection('profiles').doc(id);
        const data = await profile.get();
        if (!data.exists) {
            res.status(404).send('Profile with the given ID not found');    
        } else {
            res.send(data.data());
        }
    } catch (error) {
        res.status(400).send(error.message);
    }
}


const updateProfile = async(req,res) => {
    try {
        const id = req.params.id;
        const data = req.body;
        const profile = await firestore.collection('profiles').doc(id);
        await profile.update(data);
        res.send('Profile record update Successfully');
    } catch (error) {
        res.status(400).send(error.message);
    }
}

const deleteProfile = async(req,res) => {
    try {
        const id = req.params.id;
        await firestore.collection('profiles').doc(id).delete();
        res.send('Record deleted Successfully');
    } catch (error) {
        res.status(400).send(error.message);
    }
}


module.exports = {
    addProfile,
    getAllProfiles,
    getProfile,
    updateProfile,
    deleteProfile
}