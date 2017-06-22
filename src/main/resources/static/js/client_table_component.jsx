var ClientTableComponent = React.createClass({

    getInitialState: function() {
        return {
            clients: []
        }
    },

    componentDidMount: function() {
        axios.get('http://localhost:8080/api/clients')
            .then(res => {
                const clients = res.data;
                this.setState({clients});
            });
    },

    render: function () {
        return (
            <table className="table">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Birth date</th>
                        <th>Phone</th>
                        <th>Client type</th>
                    </tr>
                </thead>
                <tbody>
                {this.state.clients.map(client =>
                    <tr key={client.id}>
                        <td>{client.firstName}</td>
                        <td>{client.lastName}</td>
                        <td>{client.birthDate}</td>
                        <td>{client.phone}</td>
                        <td>{client.clientType}</td>                        
                    </tr>
                )}
                </tbody>
            </table>
        );
    }
});

window.ClientTableComponent = ClientTableComponent;
