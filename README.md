# 💪 Wellness360 — Push Yourself to Limits
### Android UI Design Project · IT2010 Mobile Application Development · SLIIT 2025

![Android](https://img.shields.io/badge/Android%20Studio-UI%20Design-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white)
![Kotlin](https://img.shields.io/badge/XML%20Layouts-Android-7F52FF?style=for-the-badge&logo=android&logoColor=white)
![SLIIT](https://img.shields.io/badge/SLIIT-Year%202%20Sem%202-3B82F6?style=for-the-badge&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-34d399?style=for-the-badge)

---

## 📌 Overview

**Wellness360** is a fitness mobile application UI designed for individuals who struggle to maintain a regular gym routine due to busy schedules. Built entirely with **Android XML layouts** in Android Studio, the app provides a seamless, aesthetically pleasing interface for home workouts, personalized training plans, and guided nutrition.

> *"Get fit, stay strong, and transform your health — anytime, anywhere."*

---

## 🎨 Design System

### 60-30-10 Color Rule
| Role | Color | Usage |
|------|-------|-------|
| **Primary (60%)** | Deep Dark / Navy | Backgrounds, main containers |
| **Secondary (30%)** | Vibrant Green | Cards, sections, workout panels |
| **Accent (10%)** | Electric Cyan / White | CTAs, highlights, icons, text emphasis |

All colors defined in `res/values/colors.xml` following Android best practices.

---

## 📱 App Screens

| Screen | Description |
|--------|-------------|
| **App Logo** | Brand identity splash |
| **Splash Screen** | Animated launch screen |
| **Onboarding Screen** | First-time user walkthrough |
| **Sign Up / Login** | User authentication screens |
| **Home Screen** | Workout overview, daily plan, progress |
| **Beginner Plan Pages** | Guided workout steps with images |
| **User Profile** | Personal stats and settings |

---

## 🏗️ Layout Architecture

### Layouts Used
```
✅ ConstraintLayout   — Main screens (flexible, responsive)
✅ LinearLayout       — Form fields, button groups (horizontal/vertical)
✅ ScrollView         — Long content screens (workout lists, plans)
✅ FrameLayout        — Overlay elements, splash screen
```

### Views Used
```
✅ TextView           — Labels, headings, descriptions
✅ EditText           — Login/signup input fields
✅ Button             — CTAs, navigation actions
✅ ImageView          — Workout images, icons, logo
✅ CardView           — Workout plan cards
✅ RecyclerView       — Workout and meal lists
✅ ProgressBar        — Fitness progress indicators
✅ BottomNavigationView — Tab navigation
```

---

## 🌟 Key Features (UI)

- **Personalized Workout Plans** — Guided routines with image + text instructions
- **Smart Nutrition** — Meal plan screens with calorie tracking UI
- **Mindfulness Section** — Meditation and breathing exercise layouts
- **Fitness Challenges** — Weekly/monthly challenge cards
- **Progress Tracking** — Daily, weekly, monthly analytics screens
- **Community** — Social features and fitness buddy screens

---

## 📁 Repository Structure

```
wellness360-fitness-ui/
├── README.md
├── app/
│   ├── src/main/
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   ├── activity_splash.xml
│   │   │   │   ├── activity_onboard.xml
│   │   │   │   ├── activity_login.xml
│   │   │   │   ├── activity_signup.xml
│   │   │   │   ├── activity_home.xml
│   │   │   │   ├── activity_workout.xml
│   │   │   │   ├── activity_profile.xml
│   │   │   │   └── activity_plan.xml
│   │   │   └── values/
│   │   │       ├── strings.xml
│   │   │       └── colors.xml
│   │   └── java/com/wellness360/
│   │       └── MainActivity.kt   ← Intent navigation only
└── screenshots/
    ├── logo.png
    ├── splash.png
    ├── onboard.png
    ├── login.png
    ├── home.png
    ├── beginner_plan.png
    └── profile.png
```

---

## 🔗 Navigation (Intent-based)

```kotlin
// Screen navigation using Android Intents
Splash → Onboarding → Login/Signup → Home → Workout Plans → Profile
```

All transitions implemented using `Intent` for screen-to-screen navigation without actual backend functionality.

---

## 📊 Evaluation Criteria

| Criteria | Marks |
|----------|-------|
| Ideation — App concept & target audience | 2 |
| 60-30-10 Color Rule — colors.xml | 2 |
| Layout Selection — ConstraintLayout, LinearLayout, etc. | 2 |
| Views — TextView, EditText, Button, ImageView, etc. | 2 |
| Interactivity — Intent navigation | 1 |
| Creativity — Aesthetics & out-of-the-box thinking | 1 |
| **Total** | **10** |

---

## 🎯 Target Audience

- 💼 **Busy Professionals** — Quick workouts without gym visits
- 👨‍👩‍👧 **Stay-at-Home Parents** — Flexible at-home fitness
- 🎓 **Students** — Effective workouts without memberships
- 🏋️ **Fitness Enthusiasts** — Structured home training plans
- 🌱 **Beginners** — Guided, beginner-friendly routines

---

## 📋 Module Details

- **Module:** IT2010 — Mobile Application Development
- **Assessment:** Lab Exam 02 — UI Design (CA Component)
- **Year:** 2nd Year, Semester 2 · 2025
- **Batch:** Y2.S2.WE.IT.03.02
- **Student ID:** IT23224384
- **Institute:** Sri Lanka Institute of Information Technology (SLIIT)

---

## 👩‍💻 Developer

**Ranushi Amanda** · IT23224384

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Ranushi%20Amanda-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/ranushi-amanda-b135572ba)
[![GitHub](https://img.shields.io/badge/GitHub-RanushiAmanda-100000?style=flat&logo=github&logoColor=white)](https://github.com/RanushiAmanda)
[![Blog](https://img.shields.io/badge/Blog-InsightForge-FF5722?style=flat&logo=blogger&logoColor=white)](https://ranu001coding.blogspot.com)

---

> *"Wellness360 — Your ultimate at-home fitness companion. Push yourself to limits."*
