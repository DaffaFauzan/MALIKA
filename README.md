# Malika, Bangkit 2021 Final Capstone Project
Domestic violence reporting mobile app based on android featured by offline image recognition 

### Team ID : B21-CAP0459
Theme : Women Empowerment and Child Protection

Malika is our initiative to help solve one problem about domestic violence reporting whether it is bruised-face (violence) or non-bruised-face (non-violence) using Deep Learning. We add Transfer Learning with MobileNetV2 as the base model and apply CNN in the last layer in our custom image dataset. In the end, we will have an android mobile app application where users can classify images taken with their device's camera. The app uses a converted ML model called TensorFlow Lite (.tflite) format.

## Machine Learning Learning Path
### Steps To Generate Model
1. Download dataset from
kaggle(https://www.kaggle.com/daffafauzanazhari/bruised-facememar). This dataset divided into 2 classes: violence and non-violence
2. Open Google Colaboratory notebook
You can refer to this [notebook](https://github.com/DaffaFauzan/MALIKA/blob/main/Machine-Learning/Final_Capstone_Model_MobileNetV2.ipynb) as baseline implementation with Convolutional Neural Network.
3. Create kaggle account if you don't have any. Login to kaggle.com and go to account section. Search "Create new API token".  
4. Save model
After training, you can save the model into Keras hdf5 file and convert it into TensorFlow Lite format which has a .tflite file format extension through several optimization processes such as quantization.


### Featured Technologies
* [TensorFlow](https://www.tensorflow.org/): The core open source library to help you develop and train ML models. Get started quickly by running Colab notebooks directly in your browser.
* [TensorFlow Lite](https://www.tensorflow.org/lite): TensorFlow Lite is an open source deep learning framework for on-device inference.
* [Keras](https://keras.io/): Keras is a deep learning API written in Python, running on top of the machine learning platform TensorFlow.


## Android
### Steps To...

### Featured Technologies


## Cloud Computing
### Steps To...

### Featured Technologies



## Using the App
The app allows you to either use your device's camera to snap an image or select a local image from the device's file system. Select an image of an object or put the object in frame using your camera, then click classify. Local inference will then be performed, and the top 3 results will be given with several comments.
