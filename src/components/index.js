import React, { PureComponent } from 'react';
import axios from 'axios';
import SearchEmployeeForm from './form';
import EmployeeData from './table';

export class SearchEmployee extends PureComponent {
    constructor(props) {
        super(props);
        this.state = {
            employeeData: null,
            employeeInput: ''
        };

        this.onChangeEmployeeInput = this.onChangeEmployeeInput.bind(this);
        this.onClickGetEmployees = this.onClickGetEmployees.bind(this);
    }

    onChangeEmployeeInput(value) {
        const onlyNumbers = /^[0-9]*$/;
        if(onlyNumbers.test(value)) {
            this.setState({ employeeInput: value });
        }
        
    }

    onClickGetEmployees() {
        const { employeeInput } = this.state;
        const mainUrl = 'http://localhost:8080/';
        let url = `${mainUrl}getemployees`;
        if (employeeInput) {
            url = `${mainUrl}getemployee?id=${employeeInput}`;
        }

        axios.get(url)
            .then(({ data }) => {
                this.setState({ employeeData: data ? data : [] });
            });

    }

    render() {
        const {
            employeeInput,
            employeeData
        } = this.state;

        return (
            <>
               <div className="columns-container is-centered">
                    <div className="column-container half-column">
                        <a href="https://masglobalconsulting.com/">
                            <img
                            src="https://masglobalconsulting.com/wp-content/uploads/sites/26/2019/05/MasGlobal_logo_full-1.png"
                            alt="MasGlobal Consulting"
                            />
                        </a>
                    </div>
                </div>
                <div className="columns-container is-centered form-search-employee">
                    <SearchEmployeeForm 
                        idEmployee={employeeInput}
                        onChangeEmployeeInput={this.onChangeEmployeeInput}
                        onClickGetEmployees={this.onClickGetEmployees}
                    />
                </div>

                <div className="columns-container is-centered employees-result">
                    { employeeData && <EmployeeData employeeData={employeeData} />}
                </div> 
            </>
        )
    }
}

export default SearchEmployee
