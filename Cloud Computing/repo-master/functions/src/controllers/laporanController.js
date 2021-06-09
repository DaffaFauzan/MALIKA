'use strict';

const date = require('date-and-time');

const firebase = require('../db');
const Laporan = require('../models/laporan');
const firestore = firebase.firestore();


const addLaporan = async(req,res) =>{
    try {
        const data = req.body;
        await firestore.collection('reports').doc().set({ ...data, date: date.format(new Date(), 'DD-MMM-YYYY HH:mm:ss') });
        res.send('Record Saved Successfully');
    } catch (error) {
        res.status(400).send(error.message);
    }
}

const getAllLaporans = async(req,res) => {
    try {
        const laporan = await firestore.collection('reports');
        const data = await laporan.get();
        const laporansArray = [];
        if (data.empty) {
            res.status(404).send('No reports record found');
        } else {
            data.forEach(doc => {
                const laporan = new Laporan(
                    doc.id,
                    doc.data().name,
                    doc.data().complaint,
                    doc.data().place,
                    doc.data().image,
                    doc.data().date
                );
                laporansArray.push(laporan);
            });
            res.send(laporansArray);
        }
    } catch (error) {
        res.status(400).send(error.message);
    
    }
}


const getLaporan = async(req,res) =>{
    try {
        const id = req.params.id;
        const laporan = await firestore.collection('reports').doc(id);
        const data = await laporan.get();
        if (!data.exists) {
            res.status(404).send('reports with the given ID not found');    
        } else {
            res.send(data.data());
        }
    } catch (error) {
        res.status(400).send(error.message);
    }
}


const updateLaporan = async(req,res) => {
    try {
        const id = req.params.id;
        const data = req.body;
        const laporan = await firestore.collection('reports').doc(id);
        await laporan.update(data);
        res.send('report record update Successfully');
    } catch (error) {
        res.status(400).send(error.message);
    }
}

const deleteLaporan = async(req,res) => {
    try {
        const id = req.params.id;
        await firestore.collection('reports').doc(id).delete();
        res.send('Record deleted Successfully');
    } catch (error) {
        res.status(400).send(error.message);
    }
}


module.exports = {
    addLaporan,
    getAllLaporans,
    getLaporan,
    updateLaporan,
    deleteLaporan
}