var ClientCreationComponent = React.createClass({

    getInitialState: function() {
        return {firstName: '', lastName: '', birthDate: '', phone: '', clientType: ''};
    },

    handleFirstNameChange: function(event) {
        this.setState({firstName: event.target.value})
    },

    handleLastNameChange: function(event) {
        this.setState({lastName: event.target.value})
    },
    
    handleBirthDateChange: function(event) {
        this.setState({birthDate: event.target.value})
    },
    
    handlePhoneChange: function(event) {
        this.setState({phone: event.target.value})
    },
    
    handleClientTypeChange: function(event) {
        this.setState({clientType: event.target.value})
    },

    registerClient: function() {
        axios.post('http://localhost:8080/api/clients', {
            firstName: this.state.firstName,
            lastName: this.state.lastName,
            birthDate: this.state.birthDate,
            phone: this.state.phone,
            clientType: this.state.clientType
        }).then(result => window.location = "#/");
    },

    render() {
        return (
            <div>
                <form>
                    <fieldset>
                        <legend>Register a client</legend>
                        <div className="form-group">
                            <label htmlFor="firstName">First Name</label>
                            <input className="form-control" id="firstName" name="firstName" value={this.props.firstName} onChange={this.handleFirstNameChange}/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="lastName">Last Name</label>
                            <input className="form-control" id="lastName" name="lastName" value={this.props.lastName} onChange={this.handleLastNameChange}/>
                        </div>
                            <div className="form-group">
                            <label htmlFor="birthDate">Birth date</label>
                            <input className="form-control" id="birthDate" name="birthDate" value={this.props.birthDate} onChange={this.handleBirthDateChange}/>
                        </div>                            
                        <div className="form-group">
                            <label htmlFor="phone">Phone</label>
                            <input className="form-control" id="phone" name="phone" value={this.props.phone} onChange={this.handlePhoneChange}/>
                        </div>
                            
                        <div className="form-group">
                            <label htmlFor="clientType">Client Type</label>
                            <input className="form-control" id="clientType" name="clientType" value={this.props.clientType} onChange={this.handleClientTypeChange}/>
                        </div>                               
                            
                        <div className="form-group">
                            <input className="btn btn-primary" id="registerBtn" type="button" value="Register" onClick={this.registerClient}/>
                        </div>
                    </fieldset>
                </form>
            </div>
        )
    }

});

window.ClientCreationComponent = ClientCreationComponent;