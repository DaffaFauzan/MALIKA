const express = require('express');
const{ addProfile, getAllProfiles, getProfile, updateProfile, deleteProfile } = require('../controllers/profileController');

const router = express.Router();

router.post('/profile', addProfile);
router.get('/profiles', getAllProfiles);
router.get('/profile/:id', getProfile);
router.put('profile/update/:id', updateProfile);
router.delete('/profile/delete/:id', deleteProfile);

module.exports ={
    routes : router
}