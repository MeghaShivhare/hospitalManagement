# Hospital Management
This is a java project made using Swing and Java File

This consists of total 4 modules (4 .java files acc)

## 1. Home Page 
![image](https://user-images.githubusercontent.com/85066773/170926378-6e8e9271-92c2-4c90-8874-44ff78a67a45.png)

From here you can either go to patients or doctors page
(NOTE: as for doctors page you need to enter the password) 

## 2. Login 
![image](https://user-images.githubusercontent.com/85066773/170926521-8ca89262-4c89-4264-89fe-b57dc79e25f4.png)

Here you need to enter a pre-set password in order to go into the doctors profile, in order to get the privilege of entering new symptoms with the medicines recommended
(NOTE : Password is static and can be changed through code, file name: docLogin.java ; line:61)


## 3. Doctor's - home page
![image](https://user-images.githubusercontent.com/85066773/170928278-004047bb-de53-4a01-bd0d-27d388696cc2.png)

Once verified user(doctor) can add symptoms, remedies and medicines as per

## 4. Patients - home page
![image](https://user-images.githubusercontent.com/85066773/170929832-83a287c4-9db5-4a40-a830-b5fad6fdb609.png)

Now in this page you can search for symptom you are facing

# Working 
Working is pretty simple. the symptom, remedies and medicines entered by the doctors are stored in files (dynamically created) with the same name as the symptom for example for the entered symptom fever 3 files with names fever.txt, fevermed.txt and feverrem.txt and the details entered are kept within these files. As for retrieving(when the patients searches for it) the same file names are searched and hence details are provided
