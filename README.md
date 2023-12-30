Important Note: Use API 28  in case the app encounters any errors or bugs while running.
## Overview
This repository contains the source code for a newspaper app that allows users to register accounts using email and password or login through a mobile number. The app incorporates multiple APIs for various functionalities, including user registration, login, and mobile number verification using the BD Apps API.

## Features
- User Registration: Users can create accounts using their email and password.
- Mobile Number Login: Users can log in using their mobile numbers.
- Mobile Number Verification: Implemented using the BD Apps API for enhanced security.
- Live Server Integration: The app utilizes Retrofit to communicate with the live server for database operations.

## Technologies Used
- Retrofit: Used for making API calls to interact with the live server.
- BD Apps API: Integrated for mobile number verification.
- Other APIs: Incorporated for various functionalities, enhancing the app's features.

## Database Migration
The database has been migrated to a live server for improved performance and real-time data access. The integration ensures that user data is securely stored and accessible across devices.

## Getting Started
1. Clone the repository.
2. Open the project in your preferred IDE.
3. Ensure that necessary dependencies are installed.
4. Update API keys and credentials in the appropriate configuration files.
5. Build and run the app.

## API Integration
1. **User Registration API:**
   - Endpoint: `/api/register`
   - Method: `POST`
   - Parameters: `email`, `password`

2. **Mobile Number Verification API:**
   - Endpoint: `/api/verify-mobile`
   - Method: `POST`
   - Parameters: `mobile_number`

3. **Login API:**
   - Endpoint: `/api/login`
   - Method: `POST`
   - Parameters: `email_or_mobile`, `password`

## Contribution Guidelines
Contributions to the project are welcome. Follow the standard GitHub Fork and Pull Request workflow. Ensure that your code adheres to the existing coding standards and practices.

## Issues and Bug Reports
If you encounter any issues or would like to report a bug, please use the GitHub issue tracker.
