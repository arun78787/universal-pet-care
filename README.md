🐾 Universal Pet Care Marketplace

Welcome to the Universal Pet Care Marketplace, your one-stop platform for connecting loving pet parents with trusted veterinarians. Whether your furry friend needs a routine check-up, grooming session, or emergency care, our app makes booking appointments as easy as a wag of the tail or a purr.

🛠️ Tech Stack

Frontend: React 18 (Vite), Axios, React Router, Bootstrap, Recharts for beautiful data visuals

Backend: Java 17, Spring Boot, Spring Data JPA, Spring Security (JWT), Maven

Database: MySQL (relational, reliable)

Authentication: Secure JWT-based tokens, role-based access (PATIENT, VET, ADMIN)

Extras: Lombok for cleaner code, ModelMapper for smooth DTO conversions, AWS S3 for pet photo uploads

📂 Project Structure

universal-pet-care/
├── backend/      # Spring Boot REST API (business logic & data)
└── frontend/     # React Vite app (user interface)

Backend Modules

src/main/java/com/dailycodework/universalpetcare/
├── config/       # App configurations & security setup
├── controller/   # REST endpoints for users, pets, appointments, reviews
├── dto/          # Data transfer objects for clean API contracts
├── enums/        # AppointmentStatus and other enums
├── exception/    # Custom exceptions & global error handling
├── model/        # JPA entities: User, Pet, Appointment, Review, Photo
├── repository/   # Spring Data JPA interfaces
├── request/      # Incoming request mappings
├── response/     # Standard API response wrapper
├── service/      # Business logic interfaces & implementations
└── utils/        # Constants, URL paths, helpers

Frontend Modules

src/
├── components/
│   ├── auth/         # Login, register, reset password
│   ├── appointment/  # Book, list, cancel, filter appointments
│   ├── home/         # Welcoming landing page
│   ├── pet/          # Add/edit pet profiles, breed/color selectors
│   ├── review/       # Create and view vet reviews
│   ├── admin/        # Admin dashboard and sidebar controls
│   ├── common/       # Alerts, spinners, pagination
│   └── charts/       # Dashboard graphs (appointments, signups)
├── utils/            # API client, helper functions
└── App.jsx, main.jsx # App entry and routing

🌟 Why You’ll Love It

Pet-Centric Experience: Intuitive dashboards for pet parents, vets, and admins.

Seamless Booking: Schedule, reschedule, or cancel appointments in a few clicks.

Comprehensive Profiles: Manage multiple pets, upload photos, record medical history.

Community Feedback: Trust vets through real user reviews and ratings.

Admin Insights: Access platform-wide stats and charts for informed decisions.

🚀 Quick Start

1. Clone the Repo

git clone https://github.com/arun78787/universal-pet-care.git
cd universal-pet-care

2. Backend Setup

cd backend
./mvnw spring-boot:run

URL: http://localhost:8080

Update src/main/resources/application.properties with your credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/vetsysdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

jwt.secret=SuperSecretKey
jwt.expiration=86400000
s3.bucket.name=your-s3-bucket-name

3. Frontend Setup

cd frontend
npm install
npm run dev

URL: http://localhost:5174

API base URL in src/utils/api.js (default: http://localhost:8080/api)

🔗 Key API Endpoints

Method

Endpoint

Description

POST

/api/auth/register

Sign up as pet parent or vet

POST

/api/auth/login

Sign in and receive JWT

GET

/api/appointments/{userId}

View your upcoming appointments

POST

/api/appointments/book

Schedule a new appointment

PUT

/api/appointments/{id}

Update appointment details/status

DELETE

/api/appointments/{id}

Cancel an appointment

GET

/api/pets/{userId}

List your registered pets

POST

/api/pets

Add a new pet profile

POST

/api/reviews/{vetId}

Leave a review for a vet

GET

/api/admin/dashboard

Admin overview stats & charts

🧪 Run Tests & Linting

Backend:

cd backend
./mvnw test

Frontend:

cd frontend
npm run lint

🙌 Contributing & Feedback

Found a bug or have a feature idea? Open an issue or submit a pull request. We welcome all contributions!

Need help? Reach out at arun78787-codes or on Twitter @Arun6506yadav.

👋 Author

Arun YadavGitHub – arun78787

"Because every pet deserves the best care, and every owner deserves peace of mind." 🐶🐱
