###  **EXCEPTION HANDLING**

``````
TRY WITH RESOURCES
``````
* Introduced in JAVA 1.7
* Before this version programmer needs to close each resource it has used in finally block otherwise resource is blocked
* With the new feature the resource  not needed to be closed explicitly 
* It should be a resource which should be auto closeable
* You can take any number of resources but separated by semicolon
* Autocloseable has only one method close() throws Exception
* Resources are final hence cant be reassigned