import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LandingPageComponent } from './home/landing-page/landing-page.component';
import { LoginComponent } from './home/login/login.component';
import { RegisterComponent } from './home/register/register.component';
import { LoginOrganiserComponent } from './home/login-organiser/login-organiser.component';
import { RegisterOrganiserComponent } from './home/register-organiser/register-organiser.component';
import { UserDashboardComponent } from './user/user-dashboard/user-dashboard.component';
import { UserProfileComponent } from './user/user-profile/user-profile.component';
import { TakeSurveyComponent } from './user/take-survey/take-survey.component';
import { OrganiserProfileComponent } from './organiser/organiser-profile/organiser-profile.component';
import { OrganiserDashboardComponent } from './organiser/organiser-dashboard/organiser-dashboard.component';
import { CreateSurveyComponent } from './organiser/create-survey/create-survey.component';


const routes: Routes = [
  { path: '', redirectTo: '/home/landing', pathMatch: 'full' },
  {
    path: 'home', children: [
      { path: '', redirectTo: '/home/landing', pathMatch: 'full' },
      { path: 'landing', component: LandingPageComponent },
      { path: 'login', component: LoginComponent },
      { path: 'register', component: RegisterComponent },
      { path: 'login-organiser', component: LoginOrganiserComponent },
      { path: 'register-organiser', component: RegisterOrganiserComponent }
    ]
  },
  {
    path: 'user', children: [
      { path: '', redirectTo: '/user/dashboard', pathMatch: 'full' },
      { path: 'dashboard', component: UserDashboardComponent },
      { path: 'profile', component: UserProfileComponent },
      { path: 'survey', component: TakeSurveyComponent }
    ]
  },
  {
    path: 'organiser', children: [
      { path: '', redirectTo: '/organiser/dashboard', pathMatch: 'full' },
      { path: 'dashboard', component: OrganiserDashboardComponent },
      { path: 'profile', component: OrganiserProfileComponent },
      { path: 'createsurvey', component: CreateSurveyComponent }
    ]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
