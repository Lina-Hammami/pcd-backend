import { RouterModule, Routes } from '@angular/router';
import { HomePage } from './home.page';
import {NgModule} from '@angular/core';

const routes: Routes = [
    {
        path: 'home',
        component: HomePage,
        children: [
            {
                path: 'registre',
                loadChildren: () =>
                    import('../pages/registre/registre.module').then(m => m.RegistrePageModule)
            },
            {
                path: 'feed',
                loadChildren: () =>
                    import('../pages/feed/feed.module').then(m => m.FeedPageModule)
            },
            {
                path: 'settings',
                loadChildren: () =>
                    import('../pages/settings/settings.module').then(m => m.SettingsPageModule)
            }
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class HomeRouter {}