package net.thiki.jira.robot.exception

class AssertionException(message: String?, cause: Throwable? = null, val code: Int = 0) : Throwable(message, cause)
