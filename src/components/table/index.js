import React from 'react';
import PropTypes from 'prop-types';

//@styles
import './styles.scss';

const EmployeeData = ({ employeeData }) => {

    const formatMoney = (salary) => {
        const value = salary.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1.');
        return `$ ${value}`;
    }

    const employeesList = () => {
        const employees = !Array.isArray(employeeData) ? [employeeData] : employeeData;
        if(employees.length > 0) {
            return employees.map((employee, index) => buildEmployeeRow(employee, index));
        }    
        
        return (
            <>
                <tr key="employeerownotfound">
                    <td key="employeecolumnnotfound" className="table__no-results" colSpan="6">
                        <span key="employeecolumntext" className="table__no-results--center-text">Results not Found</span>
                    </td>
                </tr>
            </>
        );   
    };

    const buildEmployeeRow = (employeeData, index = 0) => {
        return (
            <>
                <tr key={`employeerow${index}`}>
                    <td key={`employeecolumn1-${index}`}>{employeeData.id}</td>
                    <td key={`employeecolumn2-${index}`}>{employeeData.name}</td>
                    <td key={`employeecolumn3-${index}`}>{employeeData.contractTypeName}</td>
                    <td key={`employeecolumn4-${index}`}>{employeeData.roleName}</td>
                    <td key={`employeecolumn5-${index}`}>{employeeData.roleDescription}</td>
                    <td key={`employeecolumn6-${index}`}>{formatMoney(employeeData.annualSalary)}</td>
                </tr>
            </>
        );
    }

    return (
        <>
            <table className="table">
                <thead>
                    <tr key="employeeheadrow">
                        <th key="employeehead1">Id</th>
                        <th key="employeehead2">Name</th>
                        <th key="employeehead3">Contract Type</th>
                        <th key="employeehead4">Role Name</th>
                        <th key="employeehead5">Role Description</th>
                        <th key="employeehead6">Annual Salary</th>
                    </tr>
                </thead>
                <tbody key="employeedatabody">
                    {employeesList()}
                </tbody>
            </table>
        </>
    )
}

EmployeeData.propTypes = {
    employeeData: PropTypes.array.isRequired
}

export default EmployeeData
