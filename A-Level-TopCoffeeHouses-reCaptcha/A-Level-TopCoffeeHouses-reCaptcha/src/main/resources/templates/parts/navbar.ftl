<!DOCTYPE html>
<html>
<head>
    <style>
        li {
            list-style-type: none;
            /* Убираем маркеры */
        }

        ul {
            margin-left: 0;
            /* Отступ слева в браузере IE и Opera */
            padding-left: 0;
            /* Отступ слева в браузере Firefox, Safari, Chrome */
        }
    </style>
</head>

<body>
<#include "security.ftl">
<#import "login.ftl" as l>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="/">CoffeeIN</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/places">Places</a>
            </li>

            <li class="nav-item">
                <a class="nav-link" href="/user/reviews">Reviews</a>
            </li>

            <#if isAdmin>
            <li class="nav-item">
                <a class="nav-link" href="/user">User list</a>
            </li>
            </#if>

            <#if user??>
                <li class="nav-item">
                    <a class="nav-link" href="/user/profile">Profile</a>
                </li>
            </#if>
        </ul>

            <span class="navbar-text mr-3 ">${name}</span>

            <#if !user??>
                <li class="nav-item">
                    <a class="nav-link" href="/login">Sign In</a>
                </li>
            </#if>

            <#if user??>
                <@l.logout/>
            </#if>
    </div>
</nav>
</body>