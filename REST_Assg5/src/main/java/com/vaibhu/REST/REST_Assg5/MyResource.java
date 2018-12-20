package com.vaibhu.REST.REST_Assg5;

import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vaibhu.REST.REST_Assg5.model.Employee;
import com.vaibhu.REST.REST_Assg5.service.EmployeeService;

@Path("employees")
public class MyResource {

	EmployeeService service= new EmployeeService();
	
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployee(){
    	return service.getAllEmployee();
    }
    
    @POST
    @Path("/add/{employeeId}/{employeeName}/{employeeDepartment}/{employeeDesignation}/{employeeSalary}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee AddEmployee(@PathParam("employeeId") int id,@PathParam("employeeName") String name, @PathParam("employeeDepartment") String dept, @PathParam("employeeDesignation") String desg, @PathParam("employeeSalary") long sal){
    	Employee employee=new Employee(5,"sweta", "java", "def", 600000);
    	return service.AddEmployee(employee);
    }
    @DELETE
    @Path("/remove/{employeeId}/{employeeName}/{employeeDepartment}/{employeeDesignation}/{employeeSalary}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee deleteEmployee(@PathParam("employeeId") int id){
    	return service.deleteEmployee(3);
    }
}
