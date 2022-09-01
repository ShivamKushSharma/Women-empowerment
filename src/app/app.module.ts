import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
//import { OrganizationComponent } from './organization/organization.component';
import { NGOsComponent } from './ngos/ngos.component';
import { CriteriaComponent } from './ngos/criteria/criteria.component';
import { FundingNormsComponent } from './ngos/funding-norms/funding-norms.component';
//import { OrganizationsComponent } from './ngos/organizations/organizations.component';
// import { RegisterComponent } from './ngos/register/register.component';
import { StatusComponent } from './ngos/status/status.component';
import { OrganizationComponent } from './organization/organization.component';
import { HomeComponent } from './home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgoregistrationComponent } from './ngoregistration/ngoregistration.component';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './step/aboutus/aboutus.component';
import { FaqComponent } from './step/faq/faq.component';
import { GuidelinesComponent } from './step/guidelines/guidelines.component';

import { RegisterComponent } from './step/register/register.component';
import { StepComponent } from './step/step.component';
import { TrainingsectorsComponent } from './step/trainingsectors/trainingsectors.component';
import { NgodetailsComponent } from './ngodetails/ngodetails.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { AddNgoComponent } from './admin/add-ngo/add-ngo.component';
import { HomemainComponent } from './homemain/homemain.component';
import { CoursedetailsComponent } from './coursedetails/coursedetails.component';
import { AddtraineeComponent } from './admin/addtrainee/addtrainee.component';
import { CrudngoComponent } from './crudngo/crudngo.component';
import { CrudtraineeComponent } from './crudtrainee/crudtrainee.component';
import { DisplayngoComponent } from './admin/displayngo/displayngo.component';
import { DisplaytraineeComponent } from './admin/displaytrainee/displaytrainee.component';
import { EditngoComponent } from './admin/editngo/editngo.component';
import { EdittraineeComponent } from './admin/edittrainee/edittrainee.component';
import { TraineeComponent } from './admin/trainee/trainee.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { PolicyComponent } from './policy/policy.component';
import { BackgroundComponent } from './background/background.component';

// import { RegistrationComponent } from './ngos/registration/registration.component';
// import { RegistrationComponent } from './ngo/registration/registration.component';
//import { RegistrationComponent } from './ngos/registration/registration.component';

@NgModule({
  declarations: [
    AppComponent,
    OrganizationComponent,
    NGOsComponent,
    CriteriaComponent,
    FundingNormsComponent,
    //OrganizationsComponent,
    RegisterComponent,
    StatusComponent,
    routingComponents,
    HomeComponent,
    NGOsComponent,
    NgoregistrationComponent,
    ContactusComponent,
    // RegistrationComponent,
   //
    // RegistrationComponent
    StepComponent,
    AboutusComponent,
    GuidelinesComponent,
    TrainingsectorsComponent,
  
    StatusComponent,
    FaqComponent,
    NgodetailsComponent,
    SignupComponent,
    LoginComponent,
    AdminComponent,
    AddNgoComponent,
    HomemainComponent,
    CoursedetailsComponent,
    CrudngoComponent,
    DisplayngoComponent,
    EditngoComponent,
    TraineeComponent,
    AddtraineeComponent,
    DisplaytraineeComponent,
    EdittraineeComponent,
    CrudtraineeComponent,
    AdminloginComponent,
    PolicyComponent,
    BackgroundComponent,

   
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
