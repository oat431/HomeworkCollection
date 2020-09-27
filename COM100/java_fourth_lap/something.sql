Create table ORDER_t (
    Order_ID INT NOT NULL AUTO INCRESEMENT,
    Customer_ID INT NOT NULL,
    Order_Date DATE NOT NULL,
    PRIMARY KEY(Order_ID)
    
);


Create table ORDER_LINE_t (
    Order_LINE_ID INT NOT NULL AUTO INCRESEMENT,
    Order_ID INT NOT NULL,
    Product_ID INT NOT NULL, 
    Order_quantity INT NOT NULL,
    PRIMARY KEY(Order_LINE_ID),
    FOREIGN KEY (Order_ID) REFERENCES Persons(ORDER_t),
    FOREIGN KEY (Product_ID) REFERENCES Persons(Product_T)
);

Create table Product_T(
    Product_ID INT NOT NULL AUTO INCRESEMENT,
    Product_Descrition VARCHAR(100),
    Product_Finish DATE NOT NULL,
    Standard_Price DECIMAL(6,2) NOT NULL,
    PRIMARY KEY(Product_ID)
);