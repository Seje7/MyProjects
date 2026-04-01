# Sales Management (Java Swing + MySQL)

A Java Swing desktop Sales/POS management application. It uses a MySQL database (`pos`) and provides UI modules for managing customers, suppliers, employees, products, sales, invoices, and reports.

## What this project contains

This is a **NetBeans Java SE (Ant)** project (you will see `nbproject/` and `build.xml`).

Key parts:
- Main entry point: `sales_management.Sales_management`
- Main window/dashboard: `sales_management.Home`
- DB connection helper: `sales_management.db`
- Modules/screens: `customer`, `supplier`, `employe`, `product`, `Sale`, `invoice`, `report`

## Requirements

- **JDK 8** (project targets Java 1.8)
- **MySQL Server**
- A MySQL database named: `pos`

### Included libraries / dependencies

This project is configured (via NetBeans project properties) to use:
- **MySQL JDBC driver**: `Sales_management/lib/MySQLDriver/mysql-connector-java-5.1.23-bin.jar`
- **JasperReports libs** (for reporting): `Sales_management/src/sales_management/jasper jar/`  
  (includes `jasperreports-5.6.0.jar` and related dependencies such as Groovy/iText/JFreeChart)

## Database configuration

The DB connection is defined in:

- `Sales_management/src/sales_management/db.java`

Default settings:
- URL: `jdbc:mysql://localhost:3306/pos`
- User: `root`
- Password: *(empty)*

If your MySQL setup differs, update `db.java` accordingly.

## How to run (NetBeans - recommended)

1. Open **NetBeans**.
2. Go to **File → Open Project…**
3. Select the `Sales_management/` folder (the one containing `build.xml` and `nbproject/`).
4. Run the project (**Run Project**).

NetBeans will launch the main class:
- `sales_management.Sales_management`

## How to build/run (Ant - command line)

Run these commands **from inside the `Sales_management/` directory**:

### Clean
```bash
ant clean
```

### Build JAR
```bash
ant jar
```

Build output:
- `dist/Sales_management.jar`

### Run
```bash
ant run
```

> Note: This project uses NetBeans-generated Ant scripts (`build.xml` imports `nbproject/build-impl.xml`), so it builds/runs most reliably using NetBeans or Ant from the project folder.

## Reporting (JasperReports)

JasperReports dependencies are included in:
- `src/sales_management/jasper jar/`

There is also an iReport installer included in the repo (Windows):
- `src/sales_management/iReport-5.6.0-windows-installer (1).exe`

## Troubleshooting

### MySQL connection errors
- Confirm MySQL is running on `localhost`
- Confirm the database `pos` exists
- Verify credentials in `db.java`

### Missing library errors in NetBeans
- Ensure these paths exist in the project:
  - `Sales_management/lib/MySQLDriver/mysql-connector-java-5.1.23-bin.jar`
  - `Sales_management/src/sales_management/jasper jar/` (jar files inside)

## License
Add a license if you plan to distribute this project.
