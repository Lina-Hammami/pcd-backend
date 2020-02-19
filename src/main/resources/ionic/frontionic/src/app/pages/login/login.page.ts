import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {Administrateur} from '../../models/Administrateur';
import {AuthenticationService} from '../../services/AuthenticationService';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
    ngOnInit(): void {
    }
  constructor(){}
    checkLogin() {
        this.router.navigate(['/home']);
    }
  /*
    a: Administrateur = {email: '', password: '', id: '', username: ''};
    invalidLogin = false;

    constructor(private router: Router,
                private loginservice: AuthenticationService) { }

    ngOnInit() {
    }

    checkLogin() {
        this.loginservice.authenticate(this.a).subscribe(
            OK => {
                console.log('elobject ok fih : '+OK);
                console.log('el id eli jey ml ok howa :  '+(OK as any).id);
                sessionStorage.setItem('email', (OK as any).email);
                this.router.navigate(['/home']);
                this.invalidLogin = false;
            });
    }*/
}
