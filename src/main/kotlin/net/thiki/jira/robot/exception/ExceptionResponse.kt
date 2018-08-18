package net.thiki.jira.robot.exception

import java.util.*

data class ExceptionResponse(val timestamp:Date, val message:String, val detail:String, val code:Int = 0)