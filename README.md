I have implemented visitor pattern here and I have used example of shopping different staffs from different stores.

#Why

Suppose, I want to buy lot of stuffs for my household. But I need to go to different stores to buy those and I have a list of stores to go to. To make sure I can visit all the stores to buy specific staffs from specific stores, I have implemented Visitor pattern.

#Implementation

Here elements are ClothingStore, ElectronicStore, GroceryStore and they all implements Store interface.
Visitor has four different methods, one of them is doShopping which takes a list of store, and inside that it calls accept method for each store. Then each store makes call to specific method from visitor class and thats how visitor visits each of the stores in the list.

VisitorPatternTestClient has main method to test this implementation.