# ☕ Coffee Shop App (Android - Jetpack Compose)

A modern **Coffee Shop Android application** built using **Jetpack Compose** in **Android Studio**.
This app provides a smooth and visually appealing UI for browsing coffee items, viewing details, managing favorites, and simulating a shopping experience.

---

## 📱 Features

* 🏠 **Home Screen**

  * Displays a list of coffee products
  * Clean and modern UI using Compose

* 📄 **Product Details**

  * View coffee description, price, and size options
  * Interactive UI components

* ❤️ **Favorites**

  * Add/remove items from favorites
  * Persistent UI state handling

* 🛒 **Cart (Optional / Expandable)**

  * Add items to cart
  * Modify quantity *(if implemented)*

* 🎨 **Modern UI/UX**

  * Built entirely with Jetpack Compose
  * Responsive layouts and smooth interactions

---

## 🛠️ Tech Stack

* **Language:** Kotlin

* **UI Toolkit:** Jetpack Compose

* **IDE:** Android Studio

* **Architecture:** (Update if used)

  * MVVM / Single Activity Architecture

* **State Management:**

  * `remember`, `mutableStateOf`
  * Compose State Handling

* **Navigation:**

  * Jetpack Navigation Compose

---

## 📂 Project Structure

```
com.example.coffeeshop
│
├── Navigation/
│   └── NavGraph.kt
│
├── Screens/
│   ├── HomeScreen/
│   ├── DetailScreen/
│   ├── CartScreen/
│   ├── FavouriteScreen/
│   └── WelcomeScreen/
│
├── Components/
│   ├── ProductCard.kt
│   ├── SizeChip.kt
│   └── CustomButtons.kt
│
├── Model/
│   └── Product.kt
│
└── MainActivity.kt
```

---

## 🚀 Getting Started

### Prerequisites

* Android Studio (latest version recommended)
* Kotlin support enabled
* Android SDK installed

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/coffee-shop-app.git
   ```

2. Open in Android Studio

3. Sync Gradle

4. Run the app on:

   * Emulator OR
   * Physical device

---

## 🧠 Key Concepts Used

* **Composable Functions**
* **State Hoisting**
* **LazyColumn / LazyRow**
* **Material Design 3**
* **Navigation with arguments**
* **Reusable UI Components**

---

## 📸 Screenshots

*(Add your screenshots here)*

Example:

* Home Screen
* Product Details
* Cart Screen

---

## 🔧 Future Improvements

* 🔐 User Authentication (Firebase)
* 🛍️ Backend Integration (API)
* 💳 Payment Gateway
* 🌙 Dark Mode
* 📦 Order History

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repo
2. Create a new branch
3. Commit changes
4. Open a Pull Request
