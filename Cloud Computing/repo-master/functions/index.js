'use strict';
const functions = require("firebase-functions");
const express = require("express");
const app = express();
const ProfileRoutes = require('./src/routes/profile_routes');
const ReportsRoutes = require('./src/routes/laporan_routes');

const cors = require("cors");
app.use(express.json());
app.use(cors());

app.use('/api/v1', ProfileRoutes.routes);
app.use('/api/v1', ReportsRoutes.routes);


//export Api to firebase cloud function
exports.app = functions.region("asia-southeast2").https.onRequest(app);