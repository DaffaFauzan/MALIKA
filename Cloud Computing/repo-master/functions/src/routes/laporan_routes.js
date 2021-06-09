
const express = require('express');
const{ addLaporan, getAllLaporans, getLaporan, updateLaporan, deleteLaporan } = require('../controllers/laporanController');

const router = express.Router();

router.post('/report', addLaporan);
router.get('/reports', getAllLaporans);
router.get('/reports/:id' , getLaporan);
router.put('/report/update/:id', updateLaporan);
router.delete('/report/delete/:id', deleteLaporan);


module.exports = {
    routes : router
}