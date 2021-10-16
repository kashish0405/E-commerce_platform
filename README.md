# E-Commerce Platform
## Problem Statement
Build your own online selling platform with multiple buyers and sellers. The preferred sellers have been given a priority order based on the amount they have donated you. Buyers have to first purchase all the items listed by highest priority seller before making a purchase from other sellers.

Also being a student purchaser, you have very limited space for the catalog. At any time at most N items can be stored in the catalog. If the catalog is already full, then the sellers need to wait for some buyers to buy items before they can add their product to the catalog. Also, if the catalog is empty, then the buyers need to wait until a seller adds their items to the catalog.
<!--## Requirements
The requirements of the selling platform are :
1. Buyer--> 
## Implementation

**Threads and Locks** : As we are using multiple buyer and seller threads all the operations have to be thread-safe (i.e. properly synchronized using concurrency primitives such as lock and conditions). Any operation on the shared data structures(catalog and inventory) is properly synchronized using these concepts.

**Priority Queue** : Since the buyers always buy from the preferred sellers,the *catalog data-structure* is implemented using a Priority Queue.

**Queue** : Shared among all the sellers. Each of the sellers takes an item from the *shared queue called inventory* and put it in the catalog.
