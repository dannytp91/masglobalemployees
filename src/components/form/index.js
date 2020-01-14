import React from 'react';
import PropTypes from 'prop-types';

const SearchEmployeeForm = ({
    idEmployee,
    onChangeEmployeeInput,
    onClickGetEmployees
}) => {

    const buttonLabel = idEmployee ? 'Get Employee': 'Get Employees';
    const inputLabel = idEmployee ? 'Search by employee Id': 'Search Employees';
    
    return (
        <div className="form-field is-horizontal">
            <div className="field-label is-normal">
                <label className="label">{inputLabel}</label>
            </div>
            <p className="form-field">
                <input
                    className="input"
                    type="text"
                    value={idEmployee}
                    onChange={({ target: { value } }) => onChangeEmployeeInput(value)}
                />
            </p>
            <p className="form-field">
                <button 
                    className="button"
                    onClick={onClickGetEmployees}
                >
                    {buttonLabel}
                </button>
            </p>
        </div>
    )
}

SearchEmployeeForm.propTypes = {
    idEmployee: PropTypes.string.isRequired,
    onChangeEmployeeInput: PropTypes.func.isRequired,
    onClickGetEmployees: PropTypes.func.isRequired
}

export default SearchEmployeeForm
