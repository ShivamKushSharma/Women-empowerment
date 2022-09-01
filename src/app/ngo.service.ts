import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Ngo } from "./ngoregistration/ngo";


@Injectable({
    providedIn: 'root'
  })
  export class NgoService {

    ngoList:Ngo[]=[];
 // baseURL:string="http://localhost:3000"
baseURL:string="http://localhost:8088"
  constructor(private httpSer:HttpClient) { }

  public getNgoList()
  {
    return this.httpSer.get<Ngo[]>(this.baseURL+"/ngo/all");
  }
// any ->Ngo
  public addNgo(n:Ngo){
    console.log(n);
    console.log(this.httpSer.post(this.baseURL+"/ngo/add",n));
    return this.httpSer.post(this.baseURL+"/ngo/add",n);
  }
  public updateNgo(n:Ngo) {                                
    return this.httpSer.put(this.baseURL+"/ngo/"+n.ngo_id,n);                                
  }   

  public deleteNgo(id:number){
    return this.httpSer.delete(this.baseURL + '/' + id); 
  }
  public getById(id:number){
    return this.httpSer.get<Ngo>(this.baseURL+"/ngo/"+ id);
  }


  }