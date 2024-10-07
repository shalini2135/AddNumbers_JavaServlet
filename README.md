# AddNumbers_JavaServlet
he provided code demonstrates a simple Java Servlet-based web application with two servlets, AddServlet and SquareServlet, that perform arithmetic operations (addition and squaring). The web application is configured via the web.xml deployment descriptor, which maps the servlets to specific URL patterns. 
**AddServlet.java**
Purpose: Handles requests to add two numbers.
Class: AddServlet extends HttpServlet.
Method: doGet(HttpServletRequest req, HttpServletResponse res)
Retrieves two numbers (num1 and num2) from the request parameters.
Converts these strings into integers, performs the addition, and stores the result in k.
Displays the result using PrintWriter by sending the output to the client.
Uses RequestDispatcher to forward the request to SquareServlet and shares the result of the addition (k) using the setAttribute method of the HttpServletRequest object.
**SquareServlet.java**
Purpose: Squares the result of the addition from AddServlet and displays it.
Class: SquareServlet extends HttpServlet.
Method: doGet(HttpServletRequest req, HttpServletResponse res)
Retrieves the value of k (which is the result of the addition) from the HttpServletRequest object.
Squares the value of k and sends the squared result as the response to the client.
**web.xml:**
Purpose: This is the deployment descriptor file that maps the servlets to specific URL patterns.
Mappings:
AddServlet is mapped to /add.
SquareServlet is mapped to /sq.
The mappings define the URLs used to trigger each servlet.
**index.html:**
Purpose: This HTML file provides a user interface for inputting two numbers and submitting them to the AddServlet.
Form:
The form uses the GET method to send the input numbers to the /add servlet.
Upon form submission, the two numbers are sent to AddServlet, where they are processed.
**Flow of Execution:**
The user enters two numbers in the form (index.html) and submits it.
The form sends the input data to the AddServlet, which adds the two numbers.
AddServlet forwards the result to SquareServlet using RequestDispatcher.
SquareServlet squares the result and returns the squared value to the client.
