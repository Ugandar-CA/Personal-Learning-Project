package com.example.mypersonalandroidcourse

/**-------------------------------------------------------------------------------------------------
 *
 *  Variables:
 *  A variable is a named storage location in a computer program that holds a value, allowing the program to store and manipulate data, In Kotlin, you can declare:
 *   1) read-only variables with val
 *   2) mutable variables with var
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  List:
 *  Lists store items in the order that they are added, and allow for duplicate items.
 *  To create a read-only list (List), use the listOf() function.
 *  To create a mutable list (MutableList), use the mutableListOf() function
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  Lambda expressions:
 *  Kotlin allows you to write even more concise code for functions by using lambda expressions.
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  Data classes:
 *  Data class primary purpose is to store and transport data.
 *
 *  **Automatic Component Functions:
 *  Data classes automatically generate useful functions like toString(), equals(), hashCode(), and copy(). This makes it easy to represent your class in a human-readable way, compare instances, generate hash codes, and create copies with modified values.
 *
 *  **Concise Declaration:
 *  When you declare a data class in Kotlin, you don't have to manually implement the commonly used functions. The compiler takes care of that for you, reducing boilerplate code.
 *
 *  **Property Declaration:
 *  Data classes automatically declare and initialize properties. These properties represent the data that the class is designed to hold. You can access and modify these properties easily.
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  Singleton Classes:
 *  A singleton class is a class that is designed to have only one instance, and that instance provides a global point of access to it. It ensures that there is a single point of control and coordination for a particular functionality or resource throughout the application.
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  Android Services
 *
 *  In the context of Android development, "services" refer to a component of the Android system that runs in the background to perform long-running operations or to provide some functionality independently of the user interface. There are several types of services in Android, each serving a specific purpose. Here are the main types:
 *
 *  1)Foreground Service:
 *  A foreground service is a service that the user is actively aware of and is usually running a notification for the user to indicate its ongoing operation. Foreground services are typically used for tasks that are important to the user, and the system gives them a higher priority.
 *
 *  2)Background Service:
 *  A background service is a service that runs in the background without a direct notification to the user. It performs tasks that do not require user interaction or attention.
 *
 * `3)IntentService:
 *  IntentService is a subclass of Service that simplifies the execution of background tasks on a separate thread. It processes each intent delivered to it in a sequential manner.
 *
 *  4)JobIntentService:
 *  JobIntentService is an improvement over IntentService and is compatible with the JobScheduler API. It allows you to schedule background tasks in a way that's more aware of system resource constraints.
 *
 *  5)Bound Service:
 *  A bound service is a service that allows other Android components (such as activities) to bind to it and interact with it. This type of service is often used for communication between different components of an application.
 *
 *  6)Remote Service:
 *  A remote service is a service that runs in a different process than the application's main process. It can be used for inter-process communication.
 *
 *  7)JobService:
 *  A JobService is a service that works with the JobScheduler API to execute background tasks based on certain conditions, such as when the device is idle or connected to Wi-Fi.
 *
 *  8)IntentService:
 *  IntentService is a deprecated class in recent Android versions. It is recommended to use JobIntentService or other alternatives for background processing.
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  App Launch Modes:
 *  Android allows you to specify launch modes for activities, affecting how the activity is created and brought to the foreground. Launch modes include standard, singleTop, singleTask, and singleInstance.
 *
 *--------------------------------------------------------------------------------------------------
 *
 *  Components of Android application
 *
 *  Android application architecture has the list of components given below. They are as follows:
 *
     * Services − It will be used to perform background functionalities.
     * Activities - It is a single screen that represents GUI(Graphical User Interface) with which users can interact in order to do something like dial the phone, view email, etc.
     * Broadcast receivers - Broadcast receiver is a mechanism used for listening to system-level events like listening for incoming calls, SMS, etc. by the host application.
     * Content providers − This will share the data between various applications.
 *
 *--------------------------------------------------------------------------------------------------
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */