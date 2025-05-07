# Morphia application to reproduce error with capped entities

This repository was created in regards to bug issue https://github.com/MorphiaOrg/morphia/issues/3454 at Morphia github.

## Steps to reproduce issue
1. Start a Mongodb database locally on your computer (mongodb-community-server 8.0.9 was used when this issue was created)
2. Clone the this project and run the `Morphia250TestApplication` class
3. Wait for the application to start up and finish
4. Start application again
5. This time the application should fail because of a `java.lang.ClassCastException`
