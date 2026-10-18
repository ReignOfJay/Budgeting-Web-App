# <ins/> **Dyvvy - Web App - Project Narrative** <ins>

## 🔭 <ins/> Overview <ins>

In a time of relative economic decline and suffering financial literacy, Dyvvy will provide an intuitively attractive UI that will allow users to track a variety of expenses and goals as well as learning rich financial advice.

## 🔔 <ins/> Background <ins>

The intent behind this app was originally to help myself better keep up with my own spending as well as foster better saving habits. 😪

## <ins/> Project Goals & Requirements <ins>
💻 **_Project Purpose and Objectives_**

The primary goal of the project is to create an intuitive, multi-screen budgeting web application that helps users visualize, understand, and improve their financial situations. The application, Dyvvy, is intended to make budgeting approachable for users with different ages and levels of financial literacy by combining financial tracking, goal planning, and concise financial-literacy guidance within a single application.

The application should allow users to monitor their checking and savings funds, bills, recreational spending, and other expected or planned expenses. Beyond simply recording financial information, Dyvvy should help users make informed decisions about how they allocate their money toward necessities, savings, debt, travel, and entertainment.

The project's broader objective is to create an application that encourages financial awareness rather than simply financial record keeping. Recommendations and educational snippets should be informed by credible financial research and, where appropriate, provide broad suggestions for improving a user's financial situation through budgeting, additional income opportunities, and general career-related guidance.

🤹 **_User Experience & Application Structure_**

Dyvvy will be designed as a multi-screen web application centered around a personalized dashboard. Upon creating an account and logging in, an App User (AU) will initially provide basic account information and answer a series of questions concerning their current financial situation. This information may include approximate checking and savings balances, income frequency, additional sources of income, and the areas of financial management in which they are most interested.

The application will use these responses to establish a personalized starting point for the user. The AU's dashboard should provide an immediate overview of their current finances, including checking funds, savings, bills, recreational spending, financial goals, and relevant deadlines. It should also contain short financial-literacy snippets and budgeting suggestions that can be tailored to the user's circumstances as the application develops.

Additional screens will allow users to explore their individual financial goals in greater detail. These may include a general financial calendar, debt and financial-relief planning, travel and vacation planning, recreational spending, necessities and bill tracking, and supplementary savings goals. Each feature is intended to expand upon the information presented on the main dashboard rather than function as an isolated component.

The application should also include an AU profile where users can review their account information, goals, and preferences.

💼 **_Account Management & User Roles_**

Dyvvy will initially support two primary roles: App Users (AU) and App Administrators (AA).

App Users will have their own accounts and will be responsible for entering and maintaining their personal financial information. Account creation will require information such as the user's first and last name, username, password, and a security key. Usernames and passwords will have basic complexity requirements, while the security key will provide an additional means of protecting sensitive financial information.

App Administrators will have a separate login and administrative interface through which they can oversee user accounts and modify appropriate account information. The administrator interface is envisioned as a User Overview containing AU profiles and relevant account-management functionality. Access to particularly sensitive financial information may require an AU's security key or another appropriate authorization mechanism.

The application may eventually support additional roles, such as a Budget Advisor, although this is considered a potential future extension rather than a core requirement of the initial implementation.

💰 **_Financial Features & Personalization_**

The application's primary features will revolve around helping users divide their available finances according to their individual needs and goals.

During initial setup, users will be able to identify areas they want to focus on, such as Financial Literacy, Saving, Travel, Fun, Necessities, and Dyvvy's broader financial-awareness experience. Their selections will influence the information and features presented to them.

The major financial components currently envisioned include:

Relief: Helping users organize debts, establish anticipated payoff dates, and understand how debt payments interact with their other expenses.
Travel: Allowing users to plan multiple trips, estimate transportation and lodging costs, add excursions, establish travel savings goals, and understand how planned trips could affect their available funds.
Supplementary Savings: Providing additional savings goals beyond the user's primary savings.
Fun: Helping users determine reasonable recreational spending while accounting for necessities and savings. The initial concept is to support approximately one to three recreational activities per month when financially appropriate.
Necessities: Helping users understand their recurring bills and necessary expenses, including what proportion of their available funds is committed to those expenses.
Financial Literacy: Providing concise educational information and suggestions intended to improve the user's understanding of budgeting and personal finance.

Checking and savings balances should remain editable by the AU so that manually recorded financial information can be updated as their circumstances change.

The application should ultimately use the user's financial information, goals, and preferences to provide a more personalized budgeting experience. More advanced personalization based on factors such as household or economic circumstances may be considered as the project develops.

📋 **_Development Approach & Scope_**

The development process will begin with research into financial literacy and budgeting practices so that the application's educational material and recommendations can be grounded in credible information. This research will inform both the application's financial guidance and the design of its budgeting features.

The team will then develop the application's UI/UX around the primary AU and AA experiences before implementing the underlying functionality. The intended technical approach includes a web-based frontend using React or Angular, a backend potentially using Java, Spring Boot, and MVC, and a database if persistent financial and account information requires one. APIs, including REST-based communication where appropriate, will be considered for communication between the frontend and backend.

The project will also serve as an opportunity to strengthen understanding of Java, JavaScript, HTML/CSS, full-stack development, MVC architecture, Spring Boot, frontend frameworks, backend development, APIs, databases, and software testing.

Because the project is being developed within the team's current technical capabilities and available time, the exact technologies and scope may be refined as development progresses. Features that cannot reasonably be implemented within the project constraints may be simplified or reserved for future versions.
