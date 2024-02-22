# DinnerDecider

The Dinner Decider app is a simple Android application that helps users decide where to go for dinner by randomly selecting a restaurant from a list. Users can also add new restaurants to the list for consideration.

## Getting Started

To run the app, you can clone this repository and open it in Android Studio.

1. Clone the repository:
2. Open the project in Android Studio.
3. Build and run the app on an Android device or emulator.

## App Overview

### Description
The Dinner Decider app allows users to:
- Randomly select a restaurant from a predefined list.
- Add new restaurants to the list for future selections.

### Features
- `Decide Button`: Pressing the "Decide" button randomly selects a restaurant from the list and displays it.
- `Add Food Button`: Pressing the "Add Food" button adds a new restaurant to the list.

## How to Use
1. Launch the app on your Android device or emulator.
2. Press the "Decide" button to randomly select a restaurant.
3. Optionally, you can add a new restaurant to the list by typing its name in the text field and pressing the "Add Food" button.
4. The selected restaurant will be displayed on the screen.

## Screenshots

*Screenshots will go here*

## Code Overview
- MainActivity.kt: Contains the main logic of the app.
  - foodList: An array list of restaurants.
  - onCreate(): Initializes the app and sets up event listeners for buttons.
  - decideBtn.setOnClickListener(): Randomly selects a restaurant from foodList and displays it.
  - addFoodBtn.setOnClickListener(): Adds a new restaurant to foodList.
