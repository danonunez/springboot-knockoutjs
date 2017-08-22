// The dummy view model
function DummyViewModel() {
    var self = this;
    
    self.dummies = ko.observableArray([]);
    
    // load dummies from server: GET on dummy rest controller
    self.loadDummies = function () {
        $.ajax("http://localhost:8080/jframework/api/dummy", {
            type: "GET",
            success: function (data) {
                if (data.length > 0) {
                    self.dummies(data);
                } else {
                    self.dummies([]);
                }
            }
        });
    };

    // Load initial data
    self.loadDummies();
}

// Activate knockout.js
ko.applyBindings(new DummyViewModel());