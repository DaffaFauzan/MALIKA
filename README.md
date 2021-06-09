# Malika, Bangkit 2021 Final Capstone Project
Domestic violence reporting mobile app based on android featured by offline image recognition 

### Team ID : B21-CAP0459
### Team Members
Ilyasa Ridho Tadzaka (A2912648), Reyhan Rasyid Ziddan (A2912650), Bayu Setyadji (C0070663), Hilman (C2912653), Daffa Fauzan Azhari (M3022734), Johansyah Rafdinal Ikhsan (M0070665)

Theme : Women Empowerment and Child Protection

Malika is our initiative to help solve one problem about domestic violence reporting whether it is bruised-face (violence) or non-bruised-face (non-violence) using Deep Learning. We add Transfer Learning with MobileNetV2 as the base model and apply CNN in the last layer in our custom image dataset. In the end, we will have an android mobile app application where users can classify images taken with their device's camera. The app uses a converted ML model called TensorFlow Lite (.tflite) format.

## Machine Learning Learning Path
### Steps To Generate Model

1. Open Google Colaboratory notebook
You can refer to this [notebook](https://github.com/DaffaFauzan/MALIKA/blob/main/Machine-Learning/Final_Capstone_Model_MobileNetV2.ipynb) as baseline implementation with Convolutional Neural Network.
2. Create kaggle account if you don't have any. Login to kaggle.com and go to account section. Search "Create new API token". Upload the kaggle token called "kaggle.json" to your notebook. Make sure the file called "kaggle.json", if not you can rename it. 
3. Save model
After training, you can save the model into Keras hdf5 file and convert it into TensorFlow Lite format which has a .tflite file format extension through several optimization processes such as quantization.


### Featured Technologies
* [TensorFlow](https://www.tensorflow.org/): The core open source library to help you develop and train ML models. Get started quickly by running Colab notebooks directly in your browser.
* [TensorFlow Lite](https://www.tensorflow.org/lite): TensorFlow Lite is an open source deep learning framework for on-device inference.
* [Keras](https://keras.io/): Keras is a deep learning API written in Python, running on top of the machine learning platform TensorFlow.


## Android
### Steps To Clone Project
1. Pull the project from android  or download from this link https://github.com/DaffaFauzan/MALIKA.git
2. Open In Android studio

### Featured Technologies

* [Kotlin](kotlinlang.org): Why Kotlin. Modern, concise and safe programming language. Concise; Safe; Interoperable.
* [Retrofit](square.github.io): Retrofit is the class through which your API interfaces are turned into callable objects
* [Camera 2](https://developer.android.com/training/camera2): Camera2 is the latest Android camera framework API that replaces the deprecated camera framework libraries.
* [TensorFlow Lite](https://www.tensorflow.org/lite): TensorFlow Lite is an open source deep learning framework for on-device inference.
### Screen Shoot

![ss](https://user-images.githubusercontent.com/17398200/121333082-aa78cc80-c942-11eb-8a33-358359f9b45c.PNG)


## Cloud Computing Learning Path
### Steps To deploy firebase functions
1. Make sure you have created a project in firebase or in GCP
2. Open the project directory on the local machine
3. Install the firebase CLI using npm. Note that you will need to install Node.js and npm.
to download and install the firebase CLI run the following command:
“npm install -g firebase-tools”
4. Login to Firebase using a Google Account by running the following command:
“ firebase login “
This command connects a local computer to Firebase and grants access to your Firebase project .
5. To initialize a new Firebase project, run the following command from within your app directory:
“ firebase init “
The firebase init command will guide you through setting up your project directory and some Firebase products. During project initialization, the Firebase CLI prompts to complete the following tasks: 
Select Firebase product :
 functions : Configure and deploy cloud functions
Select the default Firebase project.
6. To deploy to a Firebase project, run the following command from your project directory:
 “firebase deploy --only functions”

### Featured Technologies
* [Node js](https://nodejs.org/en/) It is suitable for those who need real time communication between client and server and The single-threaded event system is very fast when handling many requests at once from clients
* [Framework Express Js](https://expressjs.com/)  there is no need to use the default http module from NodeJS. This framework offers several features such as routing, view rendering, and supports middleware in other words it will save a lot of time in Node.js application development.

## Using the Image recognition feature.
The app allows you to use your device's camera to snap an image. Select an image of an object or put the object in frame using your camera. Local inference will then be performed, and the result will be shown whether it is violence or non-violence.
