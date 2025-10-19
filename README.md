# Vehicle Inventory Management System

## Project Overview

This  p0roject is a console-based Java application designed to manage various types of vehicles. Users can purchase vehicles, display vehicles by type or subtype, generate random vehicle lists, and save updates back to file storage. This project utilizes a modular, oop architecture, separating system control flow, menu presentation, behavioral logic, and data processing into different layers to enhance maintainability and scalability.

## Project Architecture

```
 ├─ action —— responsible for specific action implementation
 │    ├─ Action —— interface                        (Qixiao Liu)
 │    ├─ DisplayHatchbackByTypeAction ——            (Vishavjeet Singh)
 │    ├─ DisplayHybridByPowerTrainAction ——         (Huajie Zeng)
 │    ├─ DisplayPickupByCargoAction ——              (Arshdeep Singh)
 │    ├─ DisplayRandomVehiclesAction ——             (Huajie Zeng)
 │    ├─ DisplaySedanByFormatAction ——              (Arshdeep Singh)
 │    ├─ DisplaySUVByDrivetrainAction ——            (Vishavjeet Singh)
 │    ├─ DisplayVehiclesByTypeAction ——             (Huajie Zeng)
 │    ├─ PurchaseVehicleAction ——                   (Arshdeep Singh)
 │    └─ SaveAndExitAction ——                       (Vishavjeet Singh)
 │
 ├─ app package (project startup)
 │     ├─ App —— programme entrance                 (Qixiao Liu)
 │     └─ Navigator —— main process control         (Qixiao Liu)
 │
 ├─ menu package —— Menu layer and selection
 │     ├─ MenuComponent (abstract super class)      (Qixiao Liu)
 │     ├─ Menu                                      (Qixiao Liu)
 │     └─ ActionMenuItem (menu desc + actions)      (Qixiao Liu)
 │
 ├─ data package —— persistence layer
 │     └─ VehicleInventory                          (Huajie Zeng)
 │
 └─ problemDomain —— data model
       ├─ Vehicle (abstract super class)            (Qixiao Liu)
       ├─ Hatchback                                 (Vishavjeet Singh)
       ├─ Hybrid                                    (Huajie Zeng)
       ├─ PickupTruck                               (Arshdeep Singh)
       ├─ Sedan                                     (Arshdeep Singh)
       └─ SUV                                       (Vishavjeet Singh)
```

## Project Design

### design motivation

Since most of our previous assignments followed a functional, linear programming style, this project was intentionally designed to help the team transition toward object-oriented thinking.
The goal is to train members to reason in terms of **responsibilities and collaboration** between classes, rather than pure data flow or sequential logic.

**By doing so, team members can:**

1. Develop the ability to design systems around **objects and behaviors** instead of functions and control flow
2. Strengthen our understanding of **abstraction, encapsulation, and modularity**
3. Build the mindset required to **quickly adapt to real-world software projects.**

Therefore, the system was structured in multiple layers (Menu, Action, Data...) to emphasize **responsibility-driven architecture** and to cultivate a natural shift from **data flow** to **responsibility flow** in programming practice.

### design thoughts

1. Decouple menu presentation from menu behavior

* Problem: Earlier assignments mixed menu printing, input handling, and business actions in one place.
* Decision:  Separate display/navigation from  action execution.

  2. Recognize commonalities between "menus" and  "actions" and how to keep them loosely coupled.
* Problem: Menus and actions both need a description and must be selectable, yet they are different in behavior
* Decision: Introduce a common abstraction to unify how they’re referenced without binding concrete types.

  3. How to treat sub-menus as menus and connect them naturally to the main menu
* Problem: A sub-menu is structurally a menu; we need a clean way to nest menus within menus.
* Decision: Through the research we use the **Composite Pattern** so menus can contain children (menus or actions).

4. how to let the program decide when to print a menu vs. execute an action.

* Problem: After a user selection, how does the system know to display menu or execute action without if/else condition.
* Decision:  Navigator gets the selected MenuComponent; If it’s a Menu, set it as currentMenu and call display(); If it’s an ActionMenuItem, call execute(inventory, scanner); Return to the appropriate menu after execution.

## Contribution Guidelines

### Branching Strategy

```main```: **containing only tested and production-ready code.**

```feature/<feature-name>```

- Each **functionality** must be developed on their own feature branch.
- This is critical for preventing merge conflicts and maintaining clean history.

Examples: 
```
feature/purchase-vehicle
feature/display-by-type
feature/random-vehicle-list
feature/save-and-exit
```
