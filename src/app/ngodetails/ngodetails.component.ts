import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgoService } from '../ngo.service';
import { Ngo } from '../ngoregistration/ngo';

@Component({
  selector: 'app-ngodetails',
  templateUrl: './ngodetails.component.html',
  styleUrls: ['./ngodetails.component.css']
})
export class NgodetailsComponent implements OnInit {

  ngoList:Ngo[]=[];
  constructor(private ngoSer:NgoService,private router:Router) { }

  ngOnInit(): void {

    this.ngoSer.getNgoList().subscribe(data=>this.ngoList=data);
    

}
}
