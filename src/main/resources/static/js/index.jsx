const {Router, Route, hashHistory} = ReactRouter;

var App = React.createClass({
    render: function () {
        return (
            <div>
                <nav className="navbar navbar-inverse bg-inverse">
                    <a className="navbar-brand" href="#/">View Clients</a>
                    <a className="navbar-brand" href="#/createClient">Create Client</a>
                    <a className="navbar-brand" href="#/createInventory">Create Inventory</a>
                </nav>

                <Router history={hashHistory}>
                    <Route path="/" component={ClientTableComponent} />
                    <Route path="/createClient" component={ClientCreationComponent} />

                </Router>
            </div>
        );
    }
});

ReactDOM.render(<App />, document.getElementById('root'));
