# 💰 Budgeting Web App

A web application designed to make personal budgeting and financial planning more approachable, intuitive, and engaging. The application will help users organize their finances, track spending and bills, work toward financial goals, and learn practical financial concepts along the way.

> 🚧 **Status:** Planning / Early Development

## 🎯 Project Overview

The Budgeting Web App is a planned multi-screen web application focused on helping users better understand and manage their everyday finances.

The application will combine budgeting tools with financial-literacy information and personalized, rule-based guidance. Rather than presenting users with complicated financial terminology, the goal is to provide understandable information and useful suggestions based on the financial data they choose to provide.

The project will be developed using the **MVC (Model-View-Controller) architectural pattern**, beginning with the application's **Model** layer.

## ✨ Planned Features

### 📊 Dashboard

* Overview of the user's financial information
* Income and expense summaries
* Upcoming bills
* Progress toward financial goals
* Relevant financial-literacy information

### 💵 Budget Tracking

* Record sources of income
* Create spending categories
* Track expenses
* Compare planned spending against actual spending
* Monitor remaining available funds

### 🧾 Bill Tracking

* Record recurring and one-time bills
* Store bill amounts and due dates
* Track upcoming payments
* Account for recurring expenses when planning a budget

### 🎯 Financial Goals

* Create short- and long-term savings goals
* Set target amounts and deadlines
* Track progress toward goals
* Calculate potential savings requirements

### 💡 Financial Guidance

The application is planned to provide general, educational financial guidance based on information entered by the user.

Potential guidance may include:

* Identifying spending patterns
* Highlighting unusually high expenses
* Suggesting budgeting adjustments
* Encouraging emergency savings
* Providing general savings strategies
* Offering financial-literacy tips relevant to the user's situation

> **Note:** The application's guidance is intended to be educational and should not be treated as professional financial advice.

### 🐷 Savings Recommendations

A future savings algorithm will use information such as income, expenses, recurring bills, savings goals, and available funds to estimate reasonable savings opportunities.

The algorithm will be developed using researched financial-literacy principles rather than arbitrary recommendations.

## 🏗️ Architecture

The application will follow the **MVC (Model-View-Controller)** architectural pattern.

### Model

The Model will represent and manage the application's financial data and underlying rules.

Planned Model responsibilities include:

* User information
* Income
* Expenses
* Budget categories
* Bills
* Savings goals
* Financial calculations
* Financial-literacy data
* Data used by the future savings algorithm

### View

The View will provide the user interface for interacting with the application.

Planned screens include:

* Dashboard
* Budget
* Expenses
* Bills
* Savings Goals
* Financial Literacy / Advice

### Controller

The Controller will connect the View and Model.

It will eventually handle actions such as:

* Adding and updating financial information
* Requesting financial summaries
* Creating and modifying goals
* Requesting savings recommendations
* Passing Model data to the appropriate View

## 🧠 Financial Literacy & Recommendation System

One of the project's longer-term goals is to incorporate financial-literacy concepts into the application's functionality.

The recommendation system will initially focus on **rule-based logic** rather than attempting to make complex financial predictions.

For example, the application may eventually consider relationships between:

**Income → Essential Expenses → Non-Essential Spending → Available Funds → Savings Goals**

These relationships can then be used to provide educational suggestions or calculate potential savings scenarios.

The underlying financial concepts and rules will be researched and documented before being incorporated into the application's logic.

## 🛠️ Planned Technologies

The technology stack may evolve during development.

* **Java**
* **Spring Boot**
* **HTML**
* **CSS**
* **JavaScript**
* **REST APIs**
* **SQL / Database**
* **Git & GitHub**

## 📋 Project Goals

The primary goals of the project are to:

1. Create an intuitive multi-screen budgeting web application.
2. Practice designing a real-world application using MVC.
3. Develop a structured financial data Model before building the interface.
4. Provide useful budgeting, bill, and savings-tracking functionality.
5. Incorporate researched financial-literacy concepts into the application.
6. Develop a rule-based system capable of generating educational financial suggestions.
7. Practice full-stack web development and database integration.
8. Create a practical portfolio project demonstrating software development skills.

## 🔨 Development Plan

### Phase 1 — Financial Research & Planning

* Research fundamental financial-literacy concepts
* Identify useful budgeting and savings principles
* Determine what information the application needs from users
* Define the rules that may eventually support financial guidance
* Plan the application's data structure

### Phase 2 — MVC Model

* Create the initial Java project
* Establish the Model portion of the MVC architecture
* Create classes representing financial information
* Implement basic financial calculations
* Establish relationships between financial objects
* Begin developing the underlying savings logic

### Phase 3 — Controllers

* Create Controllers for major application functions
* Connect user actions to the Model
* Implement budgeting and goal-management operations
* Begin exposing Model functionality to the future View

### Phase 4 — Views

* Design the application's screens
* Build the dashboard
* Create budgeting, bill, expense, and savings interfaces
* Connect the Views to the Controllers

### Phase 5 — Database & Persistence

* Introduce SQL/database functionality
* Store user financial information
* Connect persistent data to the Model
* Test saving and retrieving financial information

### Phase 6 — Guidance & Refinement

* Implement researched financial-literacy rules
* Develop the savings recommendation algorithm
* Integrate relevant financial-literacy snippets
* Test recommendations using different financial scenarios
* Improve usability and presentation

## 📌 Current Status

The project is currently at the **planning / early development stage**.

The first development focus will be the **Model** of the MVC architecture. Financial-literacy research will be used to help determine what information the Model should store and what rules may eventually support the application's savings and guidance features.

As development progresses, this README will be updated to reflect implemented functionality rather than planned functionality.

