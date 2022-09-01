import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router) { }
  gotoNgos(){
    this.router.navigate(['/ngos']);  // define your component where you want to go
}
gotoHome()
{
  this.router.navigate(['/home']);
}

  ngOnInit(): void {
  }

}
