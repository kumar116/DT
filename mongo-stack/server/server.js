/** **/
console.log("Welcome, to the Server.");

/** publish **/
Meteor.publish("myStack", function() {
    return myStack.find({});
});


