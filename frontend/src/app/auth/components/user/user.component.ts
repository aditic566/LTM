<<<<<<< HEAD
import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { AuthService } from "../../services/auth.service";
import { HttpErrorResponse } from "@angular/common/http";

@Component({
    selector: "app-user",
    templateUrl: "./user.component.html",
    styleUrls: ["./user.component.scss"],
})
export class UserComponent implements OnInit {
    userForm: FormGroup;
    successMessage: string | null = null;
    errorMessage: string | null = null;
=======
import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { AuthService } from "../../services/auth.service";


@Component({
    selector : 'app-user',
    template : './user.component.html',

})
export class UserComponent  {

    userForm : FormGroup<any>;
    errorMessage : string = '';
    successMessage : string = '';
>>>>>>> 8351afc1423865327955609d48f17be0b494154f

    constructor(
        private formBuilder: FormBuilder,
        private authService: AuthService
    ) { }

    ngOnInit(): void {
        this.userForm = this.formBuilder.group({
<<<<<<< HEAD
            username: ["", [Validators.required, this.noSpecialCharacters]],
            password: ["", [Validators.required, Validators.minLength(8)]],
            role: ["", [Validators.required]],
            supplierName: ["", [Validators.required]],
            email: ["", [Validators.required, Validators.email]],
        });
    }

    private noSpecialCharacters(control: any): { [key: string]: boolean } | null {
        const SPECIAL_CHARACTERS_REGEX = /[!@#$%^&*()_+{}\[\]:;<>,.?~\\/-]/;
        if (SPECIAL_CHARACTERS_REGEX.test(control.value)) {
            return { specialCharacters: true };
        }
        return null;
    }

=======
            username: ["", [Validators.required]],
            password: ["", [Validators.required]],
            email: ["", [Validators.required, Validators.email]],
            role: ["", [Validators.required]],
        });
    }

>>>>>>> 8351afc1423865327955609d48f17be0b494154f
    onSubmit(): void {
        if (this.userForm.valid) {
            this.authService.createUser(this.userForm.value).subscribe({
                next: (response) => {
<<<<<<< HEAD
                    this.successMessage = "User created successfully";
                    this.userForm.reset();
                    this.errorMessage = "";
                },
                error: (error) => {
                    console.log(error);
                    this.errorMessage = error.error ?? "Please fill the form correctly";
=======
                    this.successMessage = "User created";
                    this.userForm.reset();
                },
                error: (error) => {
                    this.errorMessage = error.error ?? "All fields are manadatory";
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
                }
            });
        }
        else {
<<<<<<< HEAD
            this.errorMessage = "Please fill the form correctly";
        }
    }
}
=======
            this.errorMessage = "All fields are mandatory";
        }
    }
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
