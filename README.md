# Succulent Shop

An educational project for Trendyol Android Bootcamp 2021<br/>
This is a cumulative and individual project, every incoming assignment is added to the previous work.<br/>
For UI design: [Figma](https://www.figma.com/file/aKFn9Czmk2ms2hqp4sctcw/Succulent-Shop?node-id=0%3A1)

## Assignment #1: Create Signup Screen UI :heavy_check_mark:
 ### Todo
  * Design the screen using TextInputLayouts and MaterialButtons as shown in the image.
  * Add client-side validation to the fields and show related errors on the fields when user clicks SIGN UP button. (See validation table)
  * Clicking ALREADY HAVE AN ACCOUNT? button should navigate user to Login Screen.
  * Clicking CREATE AN ACCOUNT button on Login Screen should navigate user to Signup Screen.

## Assignment #2: Navigation Component and RecyclerView :heavy_check_mark:
 ### Todo
  * Create SignupFragment and move logic from SignupActivity into there, deleting SignupActivity.
  * Add SignupFragment to the nav_graph.xml adding necessary actions.
  * Add a function fun relatedProducts(productId: Int): List<Product> into ProductStore which returns arbitrary (random or any logic) list of related products
  * Add the Related Products section into ProductDetailFragment which gets data from ProductStore and displays it in a horizontal RecyclerView.
  * Add a click listener to the related products which would navigate user to ProductDetailFragment for the clicked product.

## Assignment #3: Integrate Signup and Related Products API (In Progress...)
 ### Todo
  * Signup API
  * Related Products
  * Circular Progress Indicator
  * Logout Action
  * Skip login flow when user is logged in


