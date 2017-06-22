var InventoryCreationComponent = React.createClass({

    getInitialState: function() {
        return {title: '', weight: '', sector: '', date: ''};
    },

    handleTitleChange: function(event) {
        this.setState({title: event.target.value})
    },

    handleWeightChange: function(event) {
        this.setState({weight: event.target.value})
    },
    
    handleSectorChange: function(event) {
        this.setState({sector: event.target.value})
    },
    
    handleDateChange: function(event) {
        this.setState({date: event.target.value})
    },
    
    registerClient: function() {
        axios.post('http://localhost:8080/api/inventory', {
            title: this.state.title,
            weight: this.state.weight,
            sector: this.state.sector,
            date: this.state.date
        }).then(result => window.location = "#/");
    },

    render() {
        return (
            <div>
                <form>
                    <fieldset>
                        <legend>Register a client</legend>
                        <div className="form-group">
                            <label htmlFor="title">Inventory Title</label>
                            <input className="form-control" id="title" name="title" value={this.props.title} onChange={this.handleTitleChange}/>
                        </div>
                        <div className="form-group">
                            <label htmlFor="weight">Last Name</label>
                            <input className="form-control" id="weight" name="weight" value={this.props.weight} onChange={this.handleWeightChange}/>
                        </div>
                            <div className="form-group">
                            <label htmlFor="date">Inventory date</label>
                            <input className="form-control" id="date" name="date" value={this.props.date} onChange={this.handleDateChange}/>
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

window.InventoryCreationComponent = InventoryCreationComponent;