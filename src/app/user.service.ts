import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './step/register/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  userList:User[]=[];
  //baseURL:string="http://localhost:3000/users"
   baseURL:string="http://localhost:8088";
 
   constructor(private httpSer:HttpClient) { }
   public getUserList():Observable<User[]>
   {
 
    // alert(this.httpSer.get<User[]>(this.baseURL+"/user/all"));
     return this.httpSer.get<User[]>(this.baseURL+"/user/register/all");
     
   }
 
   public addUser(u:User){
     alert(u);
     console.log(this.httpSer.post(this.baseURL+"/user/addregistration" , u));
     return this.httpSer.post(this.baseURL+"/user/addregistration",u);
   }
   public updateUser(u:User) {                                
     return this.httpSer.put(this.baseURL +'/user/'+ u.r_id, u);                                
   }   
 
   public deleteUser(id:number){
     return this.httpSer.delete(this.baseURL+"/deleteregister/"+ id); 
   }
}
