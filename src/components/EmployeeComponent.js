import React, { useState, useEffect } from 'react'
import EmployeeService from '../services/EmployeeService';


function EmployeeComponent() {

    const [employees, setEmployees] = useState([]);

    useEffect(() => {
        getEmployees();
    }, []);


    const getEmployees = () => {
        EmployeeService.getEmployee().then((response) => {
            setEmployees(response.data);
            console.log(response.data);
        })
    }

    return (
        <div className="container">
            <h1 className="text-center">Employee Data</h1>
            <table className="table table-stripped">
                <thead>
                    <tr>
                        <th>Employee ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                    </tr>
                </thead>

                <tbody>
                    {
                        employees.map(
                            employee =>
                                <tr key={employee.id}>
                                    <td>{employee.id}</td>
                                    <td>{employee.fname}</td>
                                    <td>{employee.lname}</td>
                                    <td>{employee.email}</td>
                                </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    )
}

export default EmployeeComponent