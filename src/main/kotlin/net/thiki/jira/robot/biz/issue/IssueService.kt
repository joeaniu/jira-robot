package net.thiki.jira.robot.biz.issue

import net.thiki.jira.robot.biz.issue.Issue
import net.thiki.jira.robot.biz.issue.IssueRepo
import org.springframework.stereotype.Service

@Service
class IssueService(private val issueRepo: IssueRepo){

    fun findAll(): List<Issue> {
        return issueRepo.findAllIssue()
    }

    fun findIssuesByStatus(status: Long): List<Issue> {
        return issueRepo.findIssuesByStatus(status)
    }

    fun searchByReporter(reporterKey: String): List<Issue> {
        return issueRepo.searchByReporter(reporterKey)
    }

    fun searchDetailByReporter(reporterKey: String): List<Issue> {
        return issueRepo.searchDetailByReporter(reporterKey)
    }
}