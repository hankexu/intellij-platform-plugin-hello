package com.github.hankexu.intellijplatformpluginhello.services

import com.intellij.openapi.project.Project
import com.github.hankexu.intellijplatformpluginhello.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
