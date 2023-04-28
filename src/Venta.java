public class Venta {
    static int x;
    //ORDERNUMBER,QUANTITYORDERED,PRICEEACH,ORDERLINENUMBER,SALES,ORDERDATE,STATUS,QTR_ID,MONTH_ID,YEAR_ID,PRODUCTLINE,MSRP,PRODUCTCODE,CUSTOMERNAME,PHONE,ADDRESSLINE1,ADDRESSLINE2,CITY,STATE,POSTALCODE,COUNTRY,TERRITORY,CONTACTLASTNAME,CONTACTFIRSTNAME,DEALSIZE
    //10107,30,95.7,2,2871,2/24/2003 0:00,Shipped,1,2,2003,Motorcycles,95,S10_1678,Land of Toys Inc.,2125557818,897 Long Airport Avenue,,NYC,NY,10022,USA,NA,Yu,Kwai,Smallint orderNumber;
    String orderNumber;
    int quantityOrdered;
    double priceEach;
    String orderLineNumber;
    double sales;
    String orderDate;
    String status;
    String qtrId;
    String monthId;
    String yearId;
    String productLine;
    String msrp;
    String productCode;
    String customerName;
    String phone;
    String addressLine1;
    String addressLine2;
    String city;// <---
    String street;
    String postalCode;
    String country;
    String territory;
    String contactLastName;
    String contactFirstName;
    String dealSize;
    int xd;

    //Constructor
    public Venta(String orderNumber, int quantityOrdered, double priceEach, String orderLineNumber,double sales,
                 String orderDate, String status, String qtrId, String monthId, String yearId, String productLine,
                 String msrp, String productCode, String customerName, String phone, String addressLine1,
                 String addressLine2, String city, String street, String postalCode, String country,
                 String territory, String contactLastName, String contactFirstName, String dealSize) {
        this.orderLineNumber = orderLineNumber;
        this.sales = sales;
        this.orderDate = orderDate;
        this.status = status;
        this.qtrId = qtrId;
        this.monthId = monthId;
        this.yearId = yearId;
        this.productLine = productLine;
        this.msrp = msrp;
        this.productCode = productCode;
        this.customerName = customerName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.country = country;
        this.territory = territory;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.dealSize = dealSize;
        this.orderNumber = orderNumber;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        x++;
        xd = x;
    }
    public String getOrderNumber() {    //10107
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getQuantityOrdered() {    //30
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getPriceEach() {     //95.7
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public String getOrderLineNumber() {    //2
        return orderLineNumber;
    }

    public void setOrderLineNumber(String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    public double getSales() {    //2871
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getOrderDate() { //2/24/2003 0:00
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() { //Shipped
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQtrId() {//1
        return qtrId;
    }

    public void setQtrId(String qtrId) {
        this.qtrId = qtrId;
    }

    public String getMonthId() {  //2
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }

    public String getYearId() {//2003
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getProductLine() {   //Motorcycles
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getMsrp() { //95
        return msrp;
    }

    public void setMsrp(String msrp) {
        this.msrp = msrp;
    }

    public String getProductCode() {//S10_1678
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCustomerName() { //Land of Toys Inc.
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() { //2125557818
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() { //897 Long Airport Avenue
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {//NULL
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {//NYC
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() { //NYC
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {//10022
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {//USA
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTerritory() { //NA
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getContactLastName() {//Fraser
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactFirstName() { //Tony
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getDealSize() {//Small
        return dealSize;
    }

    public void setDealSize(String dealSize) {
        this.dealSize = dealSize;
    }


    @Override
    public String toString() {
        return xd+"Venta{" +
                "orderNumber='" + orderNumber + '\'' +
                ", quantityOrdered=" + quantityOrdered +
                ", priceEach=" + priceEach +
                ", orderLineNumber='" + orderLineNumber + '\'' +
                ", sales='" + sales + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", status='" + status + '\'' +
                ", qtrId='" + qtrId + '\'' +
                ", monthId='" + monthId + '\'' +
                ", yearId='" + yearId + '\'' +
                ", productLine='" + productLine + '\'' +
                ", msrp='" + msrp + '\'' +
                ", productCode='" + productCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", territory='" + territory + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", dealSize='" + dealSize + '\'' +
                '}';
    }
}
