import axios from 'axios';

const EMPLOYEE_RESTURL = "http://localhost:8080/api/employees";

class EmployeeService {
    getEmployee() {
        return axios.get(EMPLOYEE_RESTURL);
    }

}

export default new EmployeeService();