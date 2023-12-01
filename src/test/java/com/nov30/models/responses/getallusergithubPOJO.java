package com.nov30.models.responses;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status"
})

public class getallusergithubPOJO {
	
	@JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.Example.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"id",
	"node_id",
	"name",
	"full_name",
	"private",
	"owner",
	"html_url",
	"description",
	"fork",
	"url",
	"forks_url",
	"keys_url",
	"collaborators_url",
	"teams_url",
	"hooks_url",
	"issue_events_url",
	"events_url",
	"assignees_url",
	"branches_url",
	"tags_url",
	"blobs_url",
	"git_tags_url",
	"git_refs_url",
	"trees_url",
	"statuses_url",
	"languages_url",
	"stargazers_url",
	"contributors_url",
	"subscribers_url",
	"subscription_url",
	"commits_url",
	"git_commits_url",
	"comments_url",
	"issue_comment_url",
	"contents_url",
	"compare_url",
	"merges_url",
	"archive_url",
	"downloads_url",
	"issues_url",
	"pulls_url",
	"milestones_url",
	"notifications_url",
	"labels_url",
	"releases_url",
	"deployments_url",
	"created_at",
	"updated_at",
	"pushed_at",
	"git_url",
	"ssh_url",
	"clone_url",
	"svn_url",
	"homepage",
	"size",
	"stargazers_count",
	"watchers_count",
	"language",
	"has_issues",
	"has_projects",
	"has_downloads",
	"has_wiki",
	"has_pages",
	"has_discussions",
	"forks_count",
	"mirror_url",
	"archived",
	"disabled",
	"open_issues_count",
	"license",
	"allow_forking",
	"is_template",
	"web_commit_signoff_required",
	"topics",
	"visibility",
	"forks",
	"open_issues",
	"watchers",
	"default_branch",
	"permissions",
	"temp_clone_token",
	"allow_squash_merge",
	"allow_merge_commit",
	"allow_rebase_merge",
	"allow_auto_merge",
	"delete_branch_on_merge",
	"allow_update_branch",
	"use_squash_pr_title_as_default",
	"squash_merge_commit_message",
	"squash_merge_commit_title",
	"merge_commit_message",
	"merge_commit_title",
	"security_and_analysis",
	"network_count",
	"subscribers_count"
	})
	@Generated("jsonschema2pojo")
	public class Example {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("node_id")
	private String nodeId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("private")
	private Boolean _private;
	@JsonProperty("owner")
	private Owner owner;
	@JsonProperty("html_url")
	private String htmlUrl;
	@JsonProperty("description")
	private String description;
	@JsonProperty("fork")
	private Boolean fork;
	@JsonProperty("url")
	private String url;
	@JsonProperty("forks_url")
	private String forksUrl;
	@JsonProperty("keys_url")
	private String keysUrl;
	@JsonProperty("collaborators_url")
	private String collaboratorsUrl;
	@JsonProperty("teams_url")
	private String teamsUrl;
	@JsonProperty("hooks_url")
	private String hooksUrl;
	@JsonProperty("issue_events_url")
	private String issueEventsUrl;
	@JsonProperty("events_url")
	private String eventsUrl;
	@JsonProperty("assignees_url")
	private String assigneesUrl;
	@JsonProperty("branches_url")
	private String branchesUrl;
	@JsonProperty("tags_url")
	private String tagsUrl;
	@JsonProperty("blobs_url")
	private String blobsUrl;
	@JsonProperty("git_tags_url")
	private String gitTagsUrl;
	@JsonProperty("git_refs_url")
	private String gitRefsUrl;
	@JsonProperty("trees_url")
	private String treesUrl;
	@JsonProperty("statuses_url")
	private String statusesUrl;
	@JsonProperty("languages_url")
	private String languagesUrl;
	@JsonProperty("stargazers_url")
	private String stargazersUrl;
	@JsonProperty("contributors_url")
	private String contributorsUrl;
	@JsonProperty("subscribers_url")
	private String subscribersUrl;
	@JsonProperty("subscription_url")
	private String subscriptionUrl;
	@JsonProperty("commits_url")
	private String commitsUrl;
	@JsonProperty("git_commits_url")
	private String gitCommitsUrl;
	@JsonProperty("comments_url")
	private String commentsUrl;
	@JsonProperty("issue_comment_url")
	private String issueCommentUrl;
	@JsonProperty("contents_url")
	private String contentsUrl;
	@JsonProperty("compare_url")
	private String compareUrl;
	@JsonProperty("merges_url")
	private String mergesUrl;
	@JsonProperty("archive_url")
	private String archiveUrl;
	@JsonProperty("downloads_url")
	private String downloadsUrl;
	@JsonProperty("issues_url")
	private String issuesUrl;
	@JsonProperty("pulls_url")
	private String pullsUrl;
	@JsonProperty("milestones_url")
	private String milestonesUrl;
	@JsonProperty("notifications_url")
	private String notificationsUrl;
	@JsonProperty("labels_url")
	private String labelsUrl;
	@JsonProperty("releases_url")
	private String releasesUrl;
	@JsonProperty("deployments_url")
	private String deploymentsUrl;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("pushed_at")
	private String pushedAt;
	@JsonProperty("git_url")
	private String gitUrl;
	@JsonProperty("ssh_url")
	private String sshUrl;
	@JsonProperty("clone_url")
	private String cloneUrl;
	@JsonProperty("svn_url")
	private String svnUrl;
	@JsonProperty("homepage")
	private String homepage;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("stargazers_count")
	private Integer stargazersCount;
	@JsonProperty("watchers_count")
	private Integer watchersCount;
	@JsonProperty("language")
	private Object language;
	@JsonProperty("has_issues")
	private Boolean hasIssues;
	@JsonProperty("has_projects")
	private Boolean hasProjects;
	@JsonProperty("has_downloads")
	private Boolean hasDownloads;
	@JsonProperty("has_wiki")
	private Boolean hasWiki;
	@JsonProperty("has_pages")
	private Boolean hasPages;
	@JsonProperty("has_discussions")
	private Boolean hasDiscussions;
	@JsonProperty("forks_count")
	private Integer forksCount;
	@JsonProperty("mirror_url")
	private Object mirrorUrl;
	@JsonProperty("archived")
	private Boolean archived;
	@JsonProperty("disabled")
	private Boolean disabled;
	@JsonProperty("open_issues_count")
	private Integer openIssuesCount;
	@JsonProperty("license")
	private Object license;
	@JsonProperty("allow_forking")
	private Boolean allowForking;
	@JsonProperty("is_template")
	private Boolean isTemplate;
	@JsonProperty("web_commit_signoff_required")
	private Boolean webCommitSignoffRequired;
	@JsonProperty("topics")
	private List<Object> topics;
	@JsonProperty("visibility")
	private String visibility;
	@JsonProperty("forks")
	private Integer forks;
	@JsonProperty("open_issues")
	private Integer openIssues;
	@JsonProperty("watchers")
	private Integer watchers;
	@JsonProperty("default_branch")
	private String defaultBranch;
	@JsonProperty("permissions")
	private Permissions permissions;
	@JsonProperty("temp_clone_token")
	private String tempCloneToken;
	@JsonProperty("allow_squash_merge")
	private Boolean allowSquashMerge;
	@JsonProperty("allow_merge_commit")
	private Boolean allowMergeCommit;
	@JsonProperty("allow_rebase_merge")
	private Boolean allowRebaseMerge;
	@JsonProperty("allow_auto_merge")
	private Boolean allowAutoMerge;
	@JsonProperty("delete_branch_on_merge")
	private Boolean deleteBranchOnMerge;
	@JsonProperty("allow_update_branch")
	private Boolean allowUpdateBranch;
	@JsonProperty("use_squash_pr_title_as_default")
	private Boolean useSquashPrTitleAsDefault;
	@JsonProperty("squash_merge_commit_message")
	private String squashMergeCommitMessage;
	@JsonProperty("squash_merge_commit_title")
	private String squashMergeCommitTitle;
	@JsonProperty("merge_commit_message")
	private String mergeCommitMessage;
	@JsonProperty("merge_commit_title")
	private String mergeCommitTitle;
	@JsonProperty("security_and_analysis")
	private SecurityAndAnalysis securityAndAnalysis;
	@JsonProperty("network_count")
	private Integer networkCount;
	@JsonProperty("subscribers_count")
	private Integer subscribersCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
	this.id = id;
	}

	@JsonProperty("node_id")
	public String getNodeId() {
	return nodeId;
	}

	@JsonProperty("node_id")
	public void setNodeId(String nodeId) {
	this.nodeId = nodeId;
	}

	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	@JsonProperty("full_name")
	public String getFullName() {
	return fullName;
	}

	@JsonProperty("full_name")
	public void setFullName(String fullName) {
	this.fullName = fullName;
	}

	@JsonProperty("private")
	public Boolean getPrivate() {
	return _private;
	}

	@JsonProperty("private")
	public void setPrivate(Boolean _private) {
	this._private = _private;
	}

	@JsonProperty("owner")
	public Owner getOwner() {
	return owner;
	}

	@JsonProperty("owner")
	public void setOwner(Owner owner) {
	this.owner = owner;
	}

	@JsonProperty("html_url")
	public String getHtmlUrl() {
	return htmlUrl;
	}

	@JsonProperty("html_url")
	public void setHtmlUrl(String htmlUrl) {
	this.htmlUrl = htmlUrl;
	}

	@JsonProperty("description")
	public String getDescription() {
	return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
	this.description = description;
	}

	@JsonProperty("fork")
	public Boolean getFork() {
	return fork;
	}

	@JsonProperty("fork")
	public void setFork(Boolean fork) {
	this.fork = fork;
	}

	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

	@JsonProperty("forks_url")
	public String getForksUrl() {
	return forksUrl;
	}

	@JsonProperty("forks_url")
	public void setForksUrl(String forksUrl) {
	this.forksUrl = forksUrl;
	}

	@JsonProperty("keys_url")
	public String getKeysUrl() {
	return keysUrl;
	}

	@JsonProperty("keys_url")
	public void setKeysUrl(String keysUrl) {
	this.keysUrl = keysUrl;
	}

	@JsonProperty("collaborators_url")
	public String getCollaboratorsUrl() {
	return collaboratorsUrl;
	}

	@JsonProperty("collaborators_url")
	public void setCollaboratorsUrl(String collaboratorsUrl) {
	this.collaboratorsUrl = collaboratorsUrl;
	}

	@JsonProperty("teams_url")
	public String getTeamsUrl() {
	return teamsUrl;
	}

	@JsonProperty("teams_url")
	public void setTeamsUrl(String teamsUrl) {
	this.teamsUrl = teamsUrl;
	}

	@JsonProperty("hooks_url")
	public String getHooksUrl() {
	return hooksUrl;
	}

	@JsonProperty("hooks_url")
	public void setHooksUrl(String hooksUrl) {
	this.hooksUrl = hooksUrl;
	}

	@JsonProperty("issue_events_url")
	public String getIssueEventsUrl() {
	return issueEventsUrl;
	}

	@JsonProperty("issue_events_url")
	public void setIssueEventsUrl(String issueEventsUrl) {
	this.issueEventsUrl = issueEventsUrl;
	}

	@JsonProperty("events_url")
	public String getEventsUrl() {
	return eventsUrl;
	}

	@JsonProperty("events_url")
	public void setEventsUrl(String eventsUrl) {
	this.eventsUrl = eventsUrl;
	}

	@JsonProperty("assignees_url")
	public String getAssigneesUrl() {
	return assigneesUrl;
	}

	@JsonProperty("assignees_url")
	public void setAssigneesUrl(String assigneesUrl) {
	this.assigneesUrl = assigneesUrl;
	}

	@JsonProperty("branches_url")
	public String getBranchesUrl() {
	return branchesUrl;
	}

	@JsonProperty("branches_url")
	public void setBranchesUrl(String branchesUrl) {
	this.branchesUrl = branchesUrl;
	}

	@JsonProperty("tags_url")
	public String getTagsUrl() {
	return tagsUrl;
	}

	@JsonProperty("tags_url")
	public void setTagsUrl(String tagsUrl) {
	this.tagsUrl = tagsUrl;
	}

	@JsonProperty("blobs_url")
	public String getBlobsUrl() {
	return blobsUrl;
	}

	@JsonProperty("blobs_url")
	public void setBlobsUrl(String blobsUrl) {
	this.blobsUrl = blobsUrl;
	}

	@JsonProperty("git_tags_url")
	public String getGitTagsUrl() {
	return gitTagsUrl;
	}

	@JsonProperty("git_tags_url")
	public void setGitTagsUrl(String gitTagsUrl) {
	this.gitTagsUrl = gitTagsUrl;
	}

	@JsonProperty("git_refs_url")
	public String getGitRefsUrl() {
	return gitRefsUrl;
	}

	@JsonProperty("git_refs_url")
	public void setGitRefsUrl(String gitRefsUrl) {
	this.gitRefsUrl = gitRefsUrl;
	}

	@JsonProperty("trees_url")
	public String getTreesUrl() {
	return treesUrl;
	}

	@JsonProperty("trees_url")
	public void setTreesUrl(String treesUrl) {
	this.treesUrl = treesUrl;
	}

	@JsonProperty("statuses_url")
	public String getStatusesUrl() {
	return statusesUrl;
	}

	@JsonProperty("statuses_url")
	public void setStatusesUrl(String statusesUrl) {
	this.statusesUrl = statusesUrl;
	}

	@JsonProperty("languages_url")
	public String getLanguagesUrl() {
	return languagesUrl;
	}

	@JsonProperty("languages_url")
	public void setLanguagesUrl(String languagesUrl) {
	this.languagesUrl = languagesUrl;
	}

	@JsonProperty("stargazers_url")
	public String getStargazersUrl() {
	return stargazersUrl;
	}

	@JsonProperty("stargazers_url")
	public void setStargazersUrl(String stargazersUrl) {
	this.stargazersUrl = stargazersUrl;
	}

	@JsonProperty("contributors_url")
	public String getContributorsUrl() {
	return contributorsUrl;
	}

	@JsonProperty("contributors_url")
	public void setContributorsUrl(String contributorsUrl) {
	this.contributorsUrl = contributorsUrl;
	}

	@JsonProperty("subscribers_url")
	public String getSubscribersUrl() {
	return subscribersUrl;
	}

	@JsonProperty("subscribers_url")
	public void setSubscribersUrl(String subscribersUrl) {
	this.subscribersUrl = subscribersUrl;
	}

	@JsonProperty("subscription_url")
	public String getSubscriptionUrl() {
	return subscriptionUrl;
	}

	@JsonProperty("subscription_url")
	public void setSubscriptionUrl(String subscriptionUrl) {
	this.subscriptionUrl = subscriptionUrl;
	}

	@JsonProperty("commits_url")
	public String getCommitsUrl() {
	return commitsUrl;
	}

	@JsonProperty("commits_url")
	public void setCommitsUrl(String commitsUrl) {
	this.commitsUrl = commitsUrl;
	}

	@JsonProperty("git_commits_url")
	public String getGitCommitsUrl() {
	return gitCommitsUrl;
	}

	@JsonProperty("git_commits_url")
	public void setGitCommitsUrl(String gitCommitsUrl) {
	this.gitCommitsUrl = gitCommitsUrl;
	}

	@JsonProperty("comments_url")
	public String getCommentsUrl() {
	return commentsUrl;
	}

	@JsonProperty("comments_url")
	public void setCommentsUrl(String commentsUrl) {
	this.commentsUrl = commentsUrl;
	}

	@JsonProperty("issue_comment_url")
	public String getIssueCommentUrl() {
	return issueCommentUrl;
	}

	@JsonProperty("issue_comment_url")
	public void setIssueCommentUrl(String issueCommentUrl) {
	this.issueCommentUrl = issueCommentUrl;
	}

	@JsonProperty("contents_url")
	public String getContentsUrl() {
	return contentsUrl;
	}

	@JsonProperty("contents_url")
	public void setContentsUrl(String contentsUrl) {
	this.contentsUrl = contentsUrl;
	}

	@JsonProperty("compare_url")
	public String getCompareUrl() {
	return compareUrl;
	}

	@JsonProperty("compare_url")
	public void setCompareUrl(String compareUrl) {
	this.compareUrl = compareUrl;
	}

	@JsonProperty("merges_url")
	public String getMergesUrl() {
	return mergesUrl;
	}

	@JsonProperty("merges_url")
	public void setMergesUrl(String mergesUrl) {
	this.mergesUrl = mergesUrl;
	}

	@JsonProperty("archive_url")
	public String getArchiveUrl() {
	return archiveUrl;
	}

	@JsonProperty("archive_url")
	public void setArchiveUrl(String archiveUrl) {
	this.archiveUrl = archiveUrl;
	}

	@JsonProperty("downloads_url")
	public String getDownloadsUrl() {
	return downloadsUrl;
	}

	@JsonProperty("downloads_url")
	public void setDownloadsUrl(String downloadsUrl) {
	this.downloadsUrl = downloadsUrl;
	}

	@JsonProperty("issues_url")
	public String getIssuesUrl() {
	return issuesUrl;
	}

	@JsonProperty("issues_url")
	public void setIssuesUrl(String issuesUrl) {
	this.issuesUrl = issuesUrl;
	}

	@JsonProperty("pulls_url")
	public String getPullsUrl() {
	return pullsUrl;
	}

	@JsonProperty("pulls_url")
	public void setPullsUrl(String pullsUrl) {
	this.pullsUrl = pullsUrl;
	}

	@JsonProperty("milestones_url")
	public String getMilestonesUrl() {
	return milestonesUrl;
	}

	@JsonProperty("milestones_url")
	public void setMilestonesUrl(String milestonesUrl) {
	this.milestonesUrl = milestonesUrl;
	}

	@JsonProperty("notifications_url")
	public String getNotificationsUrl() {
	return notificationsUrl;
	}

	@JsonProperty("notifications_url")
	public void setNotificationsUrl(String notificationsUrl) {
	this.notificationsUrl = notificationsUrl;
	}

	@JsonProperty("labels_url")
	public String getLabelsUrl() {
	return labelsUrl;
	}

	@JsonProperty("labels_url")
	public void setLabelsUrl(String labelsUrl) {
	this.labelsUrl = labelsUrl;
	}

	@JsonProperty("releases_url")
	public String getReleasesUrl() {
	return releasesUrl;
	}

	@JsonProperty("releases_url")
	public void setReleasesUrl(String releasesUrl) {
	this.releasesUrl = releasesUrl;
	}

	@JsonProperty("deployments_url")
	public String getDeploymentsUrl() {
	return deploymentsUrl;
	}

	@JsonProperty("deployments_url")
	public void setDeploymentsUrl(String deploymentsUrl) {
	this.deploymentsUrl = deploymentsUrl;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
	return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
	return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
	}

	@JsonProperty("pushed_at")
	public String getPushedAt() {
	return pushedAt;
	}

	@JsonProperty("pushed_at")
	public void setPushedAt(String pushedAt) {
	this.pushedAt = pushedAt;
	}

	@JsonProperty("git_url")
	public String getGitUrl() {
	return gitUrl;
	}

	@JsonProperty("git_url")
	public void setGitUrl(String gitUrl) {
	this.gitUrl = gitUrl;
	}

	@JsonProperty("ssh_url")
	public String getSshUrl() {
	return sshUrl;
	}

	@JsonProperty("ssh_url")
	public void setSshUrl(String sshUrl) {
	this.sshUrl = sshUrl;
	}

	@JsonProperty("clone_url")
	public String getCloneUrl() {
	return cloneUrl;
	}

	@JsonProperty("clone_url")
	public void setCloneUrl(String cloneUrl) {
	this.cloneUrl = cloneUrl;
	}

	@JsonProperty("svn_url")
	public String getSvnUrl() {
	return svnUrl;
	}

	@JsonProperty("svn_url")
	public void setSvnUrl(String svnUrl) {
	this.svnUrl = svnUrl;
	}

	@JsonProperty("homepage")
	public String getHomepage() {
	return homepage;
	}

	@JsonProperty("homepage")
	public void setHomepage(String homepage) {
	this.homepage = homepage;
	}

	@JsonProperty("size")
	public Integer getSize() {
	return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size) {
	this.size = size;
	}

	@JsonProperty("stargazers_count")
	public Integer getStargazersCount() {
	return stargazersCount;
	}

	@JsonProperty("stargazers_count")
	public void setStargazersCount(Integer stargazersCount) {
	this.stargazersCount = stargazersCount;
	}

	@JsonProperty("watchers_count")
	public Integer getWatchersCount() {
	return watchersCount;
	}

	@JsonProperty("watchers_count")
	public void setWatchersCount(Integer watchersCount) {
	this.watchersCount = watchersCount;
	}

	@JsonProperty("language")
	public Object getLanguage() {
	return language;
	}

	@JsonProperty("language")
	public void setLanguage(Object language) {
	this.language = language;
	}

	@JsonProperty("has_issues")
	public Boolean getHasIssues() {
	return hasIssues;
	}

	@JsonProperty("has_issues")
	public void setHasIssues(Boolean hasIssues) {
	this.hasIssues = hasIssues;
	}

	@JsonProperty("has_projects")
	public Boolean getHasProjects() {
	return hasProjects;
	}

	@JsonProperty("has_projects")
	public void setHasProjects(Boolean hasProjects) {
	this.hasProjects = hasProjects;
	}

	@JsonProperty("has_downloads")
	public Boolean getHasDownloads() {
	return hasDownloads;
	}

	@JsonProperty("has_downloads")
	public void setHasDownloads(Boolean hasDownloads) {
	this.hasDownloads = hasDownloads;
	}

	@JsonProperty("has_wiki")
	public Boolean getHasWiki() {
	return hasWiki;
	}

	@JsonProperty("has_wiki")
	public void setHasWiki(Boolean hasWiki) {
	this.hasWiki = hasWiki;
	}

	@JsonProperty("has_pages")
	public Boolean getHasPages() {
	return hasPages;
	}

	@JsonProperty("has_pages")
	public void setHasPages(Boolean hasPages) {
	this.hasPages = hasPages;
	}

	@JsonProperty("has_discussions")
	public Boolean getHasDiscussions() {
	return hasDiscussions;
	}

	@JsonProperty("has_discussions")
	public void setHasDiscussions(Boolean hasDiscussions) {
	this.hasDiscussions = hasDiscussions;
	}

	@JsonProperty("forks_count")
	public Integer getForksCount() {
	return forksCount;
	}

	@JsonProperty("forks_count")
	public void setForksCount(Integer forksCount) {
	this.forksCount = forksCount;
	}

	@JsonProperty("mirror_url")
	public Object getMirrorUrl() {
	return mirrorUrl;
	}

	@JsonProperty("mirror_url")
	public void setMirrorUrl(Object mirrorUrl) {
	this.mirrorUrl = mirrorUrl;
	}

	@JsonProperty("archived")
	public Boolean getArchived() {
	return archived;
	}

	@JsonProperty("archived")
	public void setArchived(Boolean archived) {
	this.archived = archived;
	}

	@JsonProperty("disabled")
	public Boolean getDisabled() {
	return disabled;
	}

	@JsonProperty("disabled")
	public void setDisabled(Boolean disabled) {
	this.disabled = disabled;
	}

	@JsonProperty("open_issues_count")
	public Integer getOpenIssuesCount() {
	return openIssuesCount;
	}

	@JsonProperty("open_issues_count")
	public void setOpenIssuesCount(Integer openIssuesCount) {
	this.openIssuesCount = openIssuesCount;
	}

	@JsonProperty("license")
	public Object getLicense() {
	return license;
	}

	@JsonProperty("license")
	public void setLicense(Object license) {
	this.license = license;
	}

	@JsonProperty("allow_forking")
	public Boolean getAllowForking() {
	return allowForking;
	}

	@JsonProperty("allow_forking")
	public void setAllowForking(Boolean allowForking) {
	this.allowForking = allowForking;
	}

	@JsonProperty("is_template")
	public Boolean getIsTemplate() {
	return isTemplate;
	}

	@JsonProperty("is_template")
	public void setIsTemplate(Boolean isTemplate) {
	this.isTemplate = isTemplate;
	}

	@JsonProperty("web_commit_signoff_required")
	public Boolean getWebCommitSignoffRequired() {
	return webCommitSignoffRequired;
	}

	@JsonProperty("web_commit_signoff_required")
	public void setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) {
	this.webCommitSignoffRequired = webCommitSignoffRequired;
	}

	@JsonProperty("topics")
	public List<Object> getTopics() {
	return topics;
	}

	@JsonProperty("topics")
	public void setTopics(List<Object> topics) {
	this.topics = topics;
	}

	@JsonProperty("visibility")
	public String getVisibility() {
	return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(String visibility) {
	this.visibility = visibility;
	}

	@JsonProperty("forks")
	public Integer getForks() {
	return forks;
	}

	@JsonProperty("forks")
	public void setForks(Integer forks) {
	this.forks = forks;
	}

	@JsonProperty("open_issues")
	public Integer getOpenIssues() {
	return openIssues;
	}

	@JsonProperty("open_issues")
	public void setOpenIssues(Integer openIssues) {
	this.openIssues = openIssues;
	}

	@JsonProperty("watchers")
	public Integer getWatchers() {
	return watchers;
	}

	@JsonProperty("watchers")
	public void setWatchers(Integer watchers) {
	this.watchers = watchers;
	}

	@JsonProperty("default_branch")
	public String getDefaultBranch() {
	return defaultBranch;
	}

	@JsonProperty("default_branch")
	public void setDefaultBranch(String defaultBranch) {
	this.defaultBranch = defaultBranch;
	}

	@JsonProperty("permissions")
	public Permissions getPermissions() {
	return permissions;
	}

	@JsonProperty("permissions")
	public void setPermissions(Permissions permissions) {
	this.permissions = permissions;
	}

	@JsonProperty("temp_clone_token")
	public String getTempCloneToken() {
	return tempCloneToken;
	}

	@JsonProperty("temp_clone_token")
	public void setTempCloneToken(String tempCloneToken) {
	this.tempCloneToken = tempCloneToken;
	}

	@JsonProperty("allow_squash_merge")
	public Boolean getAllowSquashMerge() {
	return allowSquashMerge;
	}

	@JsonProperty("allow_squash_merge")
	public void setAllowSquashMerge(Boolean allowSquashMerge) {
	this.allowSquashMerge = allowSquashMerge;
	}

	@JsonProperty("allow_merge_commit")
	public Boolean getAllowMergeCommit() {
	return allowMergeCommit;
	}

	@JsonProperty("allow_merge_commit")
	public void setAllowMergeCommit(Boolean allowMergeCommit) {
	this.allowMergeCommit = allowMergeCommit;
	}

	@JsonProperty("allow_rebase_merge")
	public Boolean getAllowRebaseMerge() {
	return allowRebaseMerge;
	}

	@JsonProperty("allow_rebase_merge")
	public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
	this.allowRebaseMerge = allowRebaseMerge;
	}

	@JsonProperty("allow_auto_merge")
	public Boolean getAllowAutoMerge() {
	return allowAutoMerge;
	}

	@JsonProperty("allow_auto_merge")
	public void setAllowAutoMerge(Boolean allowAutoMerge) {
	this.allowAutoMerge = allowAutoMerge;
	}

	@JsonProperty("delete_branch_on_merge")
	public Boolean getDeleteBranchOnMerge() {
	return deleteBranchOnMerge;
	}

	@JsonProperty("delete_branch_on_merge")
	public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
	this.deleteBranchOnMerge = deleteBranchOnMerge;
	}

	@JsonProperty("allow_update_branch")
	public Boolean getAllowUpdateBranch() {
	return allowUpdateBranch;
	}

	@JsonProperty("allow_update_branch")
	public void setAllowUpdateBranch(Boolean allowUpdateBranch) {
	this.allowUpdateBranch = allowUpdateBranch;
	}

	@JsonProperty("use_squash_pr_title_as_default")
	public Boolean getUseSquashPrTitleAsDefault() {
	return useSquashPrTitleAsDefault;
	}

	@JsonProperty("use_squash_pr_title_as_default")
	public void setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
	this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
	}

	@JsonProperty("squash_merge_commit_message")
	public String getSquashMergeCommitMessage() {
	return squashMergeCommitMessage;
	}

	@JsonProperty("squash_merge_commit_message")
	public void setSquashMergeCommitMessage(String squashMergeCommitMessage) {
	this.squashMergeCommitMessage = squashMergeCommitMessage;
	}

	@JsonProperty("squash_merge_commit_title")
	public String getSquashMergeCommitTitle() {
	return squashMergeCommitTitle;
	}

	@JsonProperty("squash_merge_commit_title")
	public void setSquashMergeCommitTitle(String squashMergeCommitTitle) {
	this.squashMergeCommitTitle = squashMergeCommitTitle;
	}

	@JsonProperty("merge_commit_message")
	public String getMergeCommitMessage() {
	return mergeCommitMessage;
	}

	@JsonProperty("merge_commit_message")
	public void setMergeCommitMessage(String mergeCommitMessage) {
	this.mergeCommitMessage = mergeCommitMessage;
	}

	@JsonProperty("merge_commit_title")
	public String getMergeCommitTitle() {
	return mergeCommitTitle;
	}

	@JsonProperty("merge_commit_title")
	public void setMergeCommitTitle(String mergeCommitTitle) {
	this.mergeCommitTitle = mergeCommitTitle;
	}

	@JsonProperty("security_and_analysis")
	public SecurityAndAnalysis getSecurityAndAnalysis() {
	return securityAndAnalysis;
	}

	@JsonProperty("security_and_analysis")
	public void setSecurityAndAnalysis(SecurityAndAnalysis securityAndAnalysis) {
	this.securityAndAnalysis = securityAndAnalysis;
	}

	@JsonProperty("network_count")
	public Integer getNetworkCount() {
	return networkCount;
	}

	@JsonProperty("network_count")
	public void setNetworkCount(Integer networkCount) {
	this.networkCount = networkCount;
	}

	@JsonProperty("subscribers_count")
	public Integer getSubscribersCount() {
	return subscribersCount;
	}

	@JsonProperty("subscribers_count")
	public void setSubscribersCount(Integer subscribersCount) {
	this.subscribersCount = subscribersCount;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.Owner.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"login",
	"id",
	"node_id",
	"avatar_url",
	"gravatar_id",
	"url",
	"html_url",
	"followers_url",
	"following_url",
	"gists_url",
	"starred_url",
	"subscriptions_url",
	"organizations_url",
	"repos_url",
	"events_url",
	"received_events_url",
	"type",
	"site_admin"
	})
	@Generated("jsonschema2pojo")
	public class Owner {

	@JsonProperty("login")
	private String login;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("node_id")
	private String nodeId;
	@JsonProperty("avatar_url")
	private String avatarUrl;
	@JsonProperty("gravatar_id")
	private String gravatarId;
	@JsonProperty("url")
	private String url;
	@JsonProperty("html_url")
	private String htmlUrl;
	@JsonProperty("followers_url")
	private String followersUrl;
	@JsonProperty("following_url")
	private String followingUrl;
	@JsonProperty("gists_url")
	private String gistsUrl;
	@JsonProperty("starred_url")
	private String starredUrl;
	@JsonProperty("subscriptions_url")
	private String subscriptionsUrl;
	@JsonProperty("organizations_url")
	private String organizationsUrl;
	@JsonProperty("repos_url")
	private String reposUrl;
	@JsonProperty("events_url")
	private String eventsUrl;
	@JsonProperty("received_events_url")
	private String receivedEventsUrl;
	@JsonProperty("type")
	private String type;
	@JsonProperty("site_admin")
	private Boolean siteAdmin;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("login")
	public String getLogin() {
	return login;
	}

	@JsonProperty("login")
	public void setLogin(String login) {
	this.login = login;
	}

	@JsonProperty("id")
	public Integer getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
	this.id = id;
	}

	@JsonProperty("node_id")
	public String getNodeId() {
	return nodeId;
	}

	@JsonProperty("node_id")
	public void setNodeId(String nodeId) {
	this.nodeId = nodeId;
	}

	@JsonProperty("avatar_url")
	public String getAvatarUrl() {
	return avatarUrl;
	}

	@JsonProperty("avatar_url")
	public void setAvatarUrl(String avatarUrl) {
	this.avatarUrl = avatarUrl;
	}

	@JsonProperty("gravatar_id")
	public String getGravatarId() {
	return gravatarId;
	}

	@JsonProperty("gravatar_id")
	public void setGravatarId(String gravatarId) {
	this.gravatarId = gravatarId;
	}

	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

	@JsonProperty("html_url")
	public String getHtmlUrl() {
	return htmlUrl;
	}

	@JsonProperty("html_url")
	public void setHtmlUrl(String htmlUrl) {
	this.htmlUrl = htmlUrl;
	}

	@JsonProperty("followers_url")
	public String getFollowersUrl() {
	return followersUrl;
	}

	@JsonProperty("followers_url")
	public void setFollowersUrl(String followersUrl) {
	this.followersUrl = followersUrl;
	}

	@JsonProperty("following_url")
	public String getFollowingUrl() {
	return followingUrl;
	}

	@JsonProperty("following_url")
	public void setFollowingUrl(String followingUrl) {
	this.followingUrl = followingUrl;
	}

	@JsonProperty("gists_url")
	public String getGistsUrl() {
	return gistsUrl;
	}

	@JsonProperty("gists_url")
	public void setGistsUrl(String gistsUrl) {
	this.gistsUrl = gistsUrl;
	}

	@JsonProperty("starred_url")
	public String getStarredUrl() {
	return starredUrl;
	}

	@JsonProperty("starred_url")
	public void setStarredUrl(String starredUrl) {
	this.starredUrl = starredUrl;
	}

	@JsonProperty("subscriptions_url")
	public String getSubscriptionsUrl() {
	return subscriptionsUrl;
	}

	@JsonProperty("subscriptions_url")
	public void setSubscriptionsUrl(String subscriptionsUrl) {
	this.subscriptionsUrl = subscriptionsUrl;
	}

	@JsonProperty("organizations_url")
	public String getOrganizationsUrl() {
	return organizationsUrl;
	}

	@JsonProperty("organizations_url")
	public void setOrganizationsUrl(String organizationsUrl) {
	this.organizationsUrl = organizationsUrl;
	}

	@JsonProperty("repos_url")
	public String getReposUrl() {
	return reposUrl;
	}

	@JsonProperty("repos_url")
	public void setReposUrl(String reposUrl) {
	this.reposUrl = reposUrl;
	}

	@JsonProperty("events_url")
	public String getEventsUrl() {
	return eventsUrl;
	}

	@JsonProperty("events_url")
	public void setEventsUrl(String eventsUrl) {
	this.eventsUrl = eventsUrl;
	}

	@JsonProperty("received_events_url")
	public String getReceivedEventsUrl() {
	return receivedEventsUrl;
	}

	@JsonProperty("received_events_url")
	public void setReceivedEventsUrl(String receivedEventsUrl) {
	this.receivedEventsUrl = receivedEventsUrl;
	}

	@JsonProperty("type")
	public String getType() {
	return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
	this.type = type;
	}

	@JsonProperty("site_admin")
	public Boolean getSiteAdmin() {
	return siteAdmin;
	}

	@JsonProperty("site_admin")
	public void setSiteAdmin(Boolean siteAdmin) {
	this.siteAdmin = siteAdmin;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.Permissions.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"admin",
	"maintain",
	"push",
	"triage",
	"pull"
	})
	@Generated("jsonschema2pojo")
	public class Permissions {

	@JsonProperty("admin")
	private Boolean admin;
	@JsonProperty("maintain")
	private Boolean maintain;
	@JsonProperty("push")
	private Boolean push;
	@JsonProperty("triage")
	private Boolean triage;
	@JsonProperty("pull")
	private Boolean pull;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("admin")
	public Boolean getAdmin() {
	return admin;
	}

	@JsonProperty("admin")
	public void setAdmin(Boolean admin) {
	this.admin = admin;
	}

	@JsonProperty("maintain")
	public Boolean getMaintain() {
	return maintain;
	}

	@JsonProperty("maintain")
	public void setMaintain(Boolean maintain) {
	this.maintain = maintain;
	}

	@JsonProperty("push")
	public Boolean getPush() {
	return push;
	}

	@JsonProperty("push")
	public void setPush(Boolean push) {
	this.push = push;
	}

	@JsonProperty("triage")
	public Boolean getTriage() {
	return triage;
	}

	@JsonProperty("triage")
	public void setTriage(Boolean triage) {
	this.triage = triage;
	}

	@JsonProperty("pull")
	public Boolean getPull() {
	return pull;
	}

	@JsonProperty("pull")
	public void setPull(Boolean pull) {
	this.pull = pull;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.SecretScanning.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"status"
	})
	@Generated("jsonschema2pojo")
	public class SecretScanning {

	@JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.SecretScanningPushProtection.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"status"
	})
	@Generated("jsonschema2pojo")
	public class SecretScanningPushProtection {

	@JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.SecretScanningValidityChecks.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"status"
	})
	@Generated("jsonschema2pojo")
	public class SecretScanningValidityChecks {

	@JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	-----------------------------------com.example.SecurityAndAnalysis.java-----------------------------------

	package com.example;

	import java.util.LinkedHashMap;
	import java.util.Map;
	import javax.annotation.Generated;
	import com.fasterxml.jackson.annotation.JsonAnyGetter;
	import com.fasterxml.jackson.annotation.JsonAnySetter;
	import com.fasterxml.jackson.annotation.JsonIgnore;
	import com.fasterxml.jackson.annotation.JsonInclude;
	import com.fasterxml.jackson.annotation.JsonProperty;
	import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"secret_scanning",
	"secret_scanning_push_protection",
	"dependabot_security_updates",
	"secret_scanning_validity_checks"
	})
	@Generated("jsonschema2pojo")
	public class SecurityAndAnalysis {

	@JsonProperty("secret_scanning")
	private SecretScanning secretScanning;
	@JsonProperty("secret_scanning_push_protection")
	private SecretScanningPushProtection secretScanningPushProtection;
	@JsonProperty("dependabot_security_updates")
	private DependabotSecurityUpdates dependabotSecurityUpdates;
	@JsonProperty("secret_scanning_validity_checks")
	private SecretScanningValidityChecks secretScanningValidityChecks;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("secret_scanning")
	public SecretScanning getSecretScanning() {
	return secretScanning;
	}

	@JsonProperty("secret_scanning")
	public void setSecretScanning(SecretScanning secretScanning) {
	this.secretScanning = secretScanning;
	}

	@JsonProperty("secret_scanning_push_protection")
	public SecretScanningPushProtection getSecretScanningPushProtection() {
	return secretScanningPushProtection;
	}

	@JsonProperty("secret_scanning_push_protection")
	public void setSecretScanningPushProtection(SecretScanningPushProtection secretScanningPushProtection) {
	this.secretScanningPushProtection = secretScanningPushProtection;
	}

	@JsonProperty("dependabot_security_updates")
	public DependabotSecurityUpdates getDependabotSecurityUpdates() {
	return dependabotSecurityUpdates;
	}

	@JsonProperty("dependabot_security_updates")
	public void setDependabotSecurityUpdates(DependabotSecurityUpdates dependabotSecurityUpdates) {
	this.dependabotSecurityUpdates = dependabotSecurityUpdates;
	}

	@JsonProperty("secret_scanning_validity_checks")
	public SecretScanningValidityChecks getSecretScanningValidityChecks() {
	return secretScanningValidityChecks;
	}

	@JsonProperty("secret_scanning_validity_checks")
	public void setSecretScanningValidityChecks(SecretScanningValidityChecks secretScanningValidityChecks) {
	this.secretScanningValidityChecks = secretScanningValidityChecks;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	}
	Use this tool offline:Maven pluginGradle pluginAnt taskCLIJava API
	Reference
	properties
	For each property present in the 'properties' definition, we add a property to a given Java class according to the JavaBeans spec. A private field is added to the parent class, along with accompanying accessor methods (getter and setter).

	E.g. json schema

	    {
	        "type" : "object",
	        "properties" : {
	            "foo" : {
	                "type" : "string"
	            }
	        }
	    }
	resulting Java type:

	    public class MyObject {
	        private String foo;
	        public String getFoo() {
	           return foo;
	        }
	        public void setFoo(String foo) {
	           this.foo = foo;
	        }
	    }
	If the generate-builders property is set to true, then a builder method is also added:

	        public MyObject withFoo(String foo) {
	            this.foo = foo;
	            return this;
	        }
	These builder methods allow easy, one-liner construction and initialization of objects, like:

	    MyObject o = new MyObject().withFoo("foo").withBar("bar").withBaz("baz");
	type
	When encountering the type attribute (e.g. for properties), jsonschema2pojo maps schema types as follows:

	Schema type	Java type
	string	java.lang.String
	number	java.lang.Double
	integer	java.lang.Integer
	boolean	java.lang.Boolean
	object	generated Java type
	array	java.util.List
	array (with "uniqueItems":true)	java.util.Set
	null	java.lang.Object
	any	java.lang.Object
	When applying the usePrimitives option, the primitives double, integer and boolean will replace the wrapper types listed above.

	additionalProperties
	If additionalProperties is specified and set to the boolean value false, then the generated Java type does not support additional properties.

	If the additionalProperties node is undefined (not present), null or empty, then a new bean property named "additionalProperties", of type Map<String,Object> is added to the generated type (with appropriate accessors). The accessors are annotated to allow Jackson to marshal/unmarshal unrecognised (additional) properties found in JSON data from/to this map.

	So, schema file myObject.json like:

	    {
	        "type" : "object"
	    }
	or

	    {
	        "type" : "object",
	        "additionalProperties" : {}
	    }
	produces:

	    public class MyObject {

	        private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<String, Object>();

	        @org.codehaus.jackson.annotate.JsonAnyGetter
	        public java.util.Map<String, Object> getAdditionalProperties() {
	            return this.additionalProperties;
	        }

	        @org.codehaus.jackson.annotate.JsonAnySetter
	        public void setAdditionalProperties(String name, Object value) {
	            this.additionalProperties.put(name, value);
	        }

	    }
	If the additionalProperties node is present and specifies a schema, then an "additionalProperties" map is added to the generated type and map values will be restricted according to the additionalProperties schema.

	So, schema file myObject.json like:

	    {
	        "type" : "object",
	        "additionalProperties" : {
	            "type" : "number"
	        }
	    }
	produces:

	    public class MyObject {

	        private java.util.Map<String, Double> additionalProperties = new java.util.HashMap<String, Double>();

	        @org.codehaus.jackson.annotate.JsonAnyGetter
	        public java.util.Map<String, Double> getAdditionalProperties() {
	            return this.additionalProperties;
	        }

	        @org.codehaus.jackson.annotate.JsonAnySetter
	        public void setAdditionalProperties(String name, Double value) {
	            this.additionalProperties.put(name, value);
	        }

	    }
	Where the additionalProperties schema species a type object, map values will be restricted to instances of a newly generated Java type. If the given schema does not specify the javaType property, the name of the newly generated type will be derived from the parent type name and the suffix 'Property'.

	So, schema file myObject.json like:

	    {
	        "type" : "object",
	        "additionalProperties" : {
	            "type" : "object"
	        }
	    }
	produces:

	    public class MyObject {

	        private java.util.Map<String, MyObjectProperty> additionalProperties = new java.util.HashMap<String, MyObjectProperty>();

	        @org.codehaus.jackson.annotate.JsonAnyGetter
	        public java.util.Map<String, MyObjectProperty> getAdditionalProperties() {
	            return this.additionalProperties;
	        }

	        @org.codehaus.jackson.annotate.JsonAnySetter
	        public void setAdditionalProperties(String name, MyObjectProperty value) {
	            this.additionalProperties.put(name, value);
	        }

	    }
	items
	The 'items' rule defines a schema for the contents of an array. In generated Java types, the value of 'items' dictates the generic type of Lists and Sets.

	So, this example JSON Schema:

	    {
	        "type" : "object",
	        "properties" : {
	            "myArrayProperty" : {
	                "type" : "array",
	                "items" : {
	                    "type" : "string"
	                }
	            }
	        }
	    }
	produces a property called myArrayProperty of type List<String> in the generated Java type. If items itself declares a complex type ("type" : "object") then the generic type of the List or Set will itself be a generated type e.g. List<MyComplexType>.

	required
	The 'required' schema rule doesn't produce a structural change in generated Java types, it simply causes the text (Required) to be added to the JavaDoc for fields, getters and setters.

	optional
	The 'optional' schema rule doesn't produce a structural change in generated Java types, it simply causes the text (Optional) to be added to the JavaDoc for fields, getters and setters.

	This schema rule is deprecated since Draft 03 of the JSON Schema specification. Rather than marking optional properties as optional, one should mark required properties as required.

	uniqueItems
	For properties of type 'array', setting uniqueItems to false (or omitting it entirely) causes the generated Java property to be of type java.util.List.

	When uniqueItems is set to true, the generated Java property value is of type java.util.Set.

	enum
	When jsonschema2pojo encounters JSON Schema declarations of type "enum" it generates a Java enum type.

	When a generated type includes a property of type "enum", the generated enum type becomes a static inner type declared within the enclosing (parent) generated type. If an enum is declared at the root of a schema, the generated enum is a public Java type with no enclosing type.

	The actual enum value is held in a 'value' property inside the enum constants. The generated enum type also includes annotations that allow Jackson to correctly marshal/unmarshal JSON values, even when the actual values contain spaces, start with digits, or contain other characters that cannot legally form part of the Java enum constant name.

	So, if we declare a schema myObject.json with an enum property:

	    {
	        "type" : "object",
	        "properties" : {
	            "myEnum" : {
	                "type" : "string",
	                "enum" : ["one", "secondOne", "3rd one"]
	            }
	        }
	    }
	we see a generated MyObject Java type with an inner enum type like:

	    @Generated("com.googlecode.jsonschema2pojo")
	    public static enum MyEnum {

	        ONE("one"),
	        SECOND_ONE("secondOne"),
	        _3_RD_ONE("3rd one");
	        private final String value;

	        private MyEnum(String value) {
	            this.value = value;
	        }

	        @JsonValue
	        @Override
	        public String toString() {
	            return this.value;
	        }

	        @JsonCreator
	        public static MyObject.MyEnum fromValue(String value) {
	            for (MyObject.MyEnum c: MyObject.MyEnum.values()) {
	                if (c.value.equals(value)) {
	                    return c;
	                }
	            }
	            throw new IllegalArgumentException(value);
	        }

	    }
	default
	Using the default rule in your JSON Schema causes the corresponding property in your generated Java type to be initialised with a default value. You'll see the default value is assigned during field declaration.

	Default values are supported for the JSON Schema properties of type string, integer, number and boolean; for enum properties; for properties with format of utc-millisec or date-time; for arrays of any of these types.

	Some example JSON Schema property definitions and their corresponding Java field declaration are shown:

	JSON Schema	Java
	myString : { "type":"string", "default":"abc"}	private String myString = "abc";
	myInteger : { "type":"integer", "default":"100"}	private Integer myInteger = 100;
	myNumber : { "type":"number", "default":"10.3"}	private Double myNumber = 10.3D;
	myMillis : { "type":"string", "format":"utc-millisec", "default":"500"}	private Long myMillis = 500L;
	myDate : { "type":"string", "format":"date-time", "default":"500"}	private Date myDate = new Date(500L);
	myDate : { "type":"string", "format":"date-time", "default":"2011-02-24T09:25:23.112+0000"}	private Date myDate = new Date(1298539523112L);
	myList : { "type":"array", "default":["a","b","c"]}	private List<String> myList = new ArrayList<String>(Arrays.asList("a","b","c"));
	As the above table shows, dates can be given a default using either a number of millis since epoch or a date string (ISO 8601 or RFC 1123). In either case, the date will be initialized using a millisecond value in the generated Java type.

	title
	The 'title' rule appearing in a JSON Schema causes the given title text to be added to the JavaDoc for a property. The title text will appear in JavaDoc comments of the field, getter and setter.

	title text always appears before description text.

	description
	The description rule appearing in a JSON Schema causes the given description text to be added to the JavaDoc for a property. The description text will appear in JavaDoc comments of the field, getter and setter.

	description text always appears after title text.

	format
	Using the format rule for a property can influence the Java type chosen to represent your property values. When you use a format value that jsonschema2pojo recognises, it will use a better (more appropriate) type for your Java bean property.

	For example, when I define a JSON property in my schema of type string, if I also attach the rule "format" : "uri" to that property (because my string is actually a URI) then my corresponding Java property will now have the type java.net.URI instead of java.lang.String.

	How jsonschema2pojo maps format values to Java types:

	Format value	Java type
	"date-time"	java.util.Date
	"date"	String
	"time"	String
	"utc-millisec"	long
	"regex"	java.util.regex.Pattern
	"color"	String
	"style"	String
	"phone"	String
	"uri"	java.net.URI
	"email"	String
	"ip-address"	String
	"ipv6"	String
	"host-name"	String
	"uuid"	java.util.UUID
	anything else (unrecognised format)	type is unchanged
	extends
	When the extends rule is encountered in your JSON schema (to indicate that one type extends another), this will produce an extends relationship in your generated Java types. That extends value can be a schema given in-line, or referenced using $ref.

	As an example, lets imagine a file flower.json with the following content:

	    {
	        "type" : "object"
	    }
	and a second file rose.json which contains:

	    {
	        "type" : "object",
	        "extends" : {
	            "$ref" : "flower.json"
	        }
	    }
	The two resulting Java types generated from these schemas would be:

	    public class Flower {
	        ....
	    }
	and

	    public class Rose extends Flower {
	        ....
	    }
	Note: the extends rule in JSON schema accepts a schema or an array of schemas - jsonschema2pojo only supports the single schema variant.

	$ref
	A '$ref' rule can be used wherever a schema is expected i.e at the root of a schema document, as part of a property definition, as part of the items definition for an array type, as part of an additionalProperties definition.

	Supported protocols:

	http://, https://
	file://
	classpath:, resource:, java: (all synonyms used to resolve schemas from the classpath).
	Note: If you want to refer to classpath resources from the current Maven module, you will need to bind jsonschema2pojo to a later phase. By default jsonschema2pojo is bound to generate-sources but if you want resources present in the current module to be on the classpath when the plugin executes, then you should bind jsonschema2pojo to the process-resources phase.

	For example, to refer to another document in the same directory which will provide the definition of a 'user' object, you might create a schema like:

	    {
	       "type" : "object",
	       "properties" : {
	          "loggedInUser" : {
	              "$ref" : "user.json"
	          }
	       }
	    }
	jsonschema2pojo expects $ref values (URIs) to be URLs. Both absolute and relative URLs are valid. You may also refer to part of a schema document using the '#' character followed by a slash or dot delimited path.

	Example using an absolute reference:

	    {
	        "type" : "object",
	        "properties" : {
	            "address" : {
	                "$ref" : "http://json-schema.org/address"
	            }
	        }
	    }
	Example using a fragment path to reuse a schema definition:

	    {
	        "type" : "object",
	        "properties" : {
	            "child1" : {
	                "type" : "string"
	            },
	            "child2" : {
	               "$ref" : "#/properties/child1"
	            }
	        }
	    }
	Example treeNode.json using a self reference to build a tree:

	    {
	       "description" : "Tree node",
	       "type" : "object",
	       "properties" : {
	          "children" : {
	             "type" : "array",
	             "items" : {
	                 "$ref" : "#"
	             }
	          }
	       }
	    }
	which produces Java code similar to:

	    public class TreeNode {

	       public List<TreeNode> getChildren() {...}

	       public void setChildren(List<TreeNode> children) {...}

	    }
	minimum/maximum, minItems/maxItems, minLength/maxLength, required, pattern
	The Maven plugin, CLI and Ant task allow JSR-303 annotations to be activated via a config argument. When activated, the following JSR-303 annotations will be generated:

	Schema rule	Annotation
	maximum	@DecimalMax
	minimum	@DecimalMin
	minItems,maxItems	@Size
	minLength,maxLength	@Size
	pattern	@Pattern
	required	@NotNull
	Extensions
	javaType
	jsonschema2pojo supports an extension property 'javaType' that applies to schemas and allows you to specify a fully qualified name for your generated Java type.

	For example, imagine a schema fooBar.json like:

	    {
	        "type" : "object"
	    }
	When invoking jsonschema2pojo with package argument com.example the generated Java type will have a fully qualified name of com.example.FooBar.

	If the javaType property is added to fooBar.json like:

	    {
	        "javaType" : "com.other.package.CustomTypeName",
	        "type" : "object"
	    }
	Then invoking jsonschema2pojo with package argument com.example will result in a generated Java type with a fully qualified name of com.other.package.CustomTypeName.

	The javaType property may appear in any schema definition, not just the root schema in a schema document. For example, this file 'parent.json' invoked using package name com.example:

	    {
	        "type" : "object",
	        "properties" : {
	            "myProperty" : {
	                "javaType" : "com.other.package.CustomChildName",
	                "type" : "object"
	            }
	        }
	    }
	will result in two generated Java types:

	com.example.Parent
	com.other.package.CustomChildName
	existingJavaType
	The existingJavaType property allows existing Java types to be used in your POJOs. The value of existingJavaType should refer to an existing class or interface, and that class/interface will not be generated.

	When referencing existing classes, it's also possible to supply generic type arguments, for instance:

	    {
	        "type" : "object",
	        "properties" : {
	            "myProperty" : {
	                "existingJavaType" : "java.util.Map<String,Integer>",
	                "type" : "object"
	            }
	        }
	    }
	javaEnumNames
	NOTE: You must only use one of javaEnumNames or javaEnums, the later being a more robust extension.

	Any schema that makes use of enum may include javaEnumNames. This property allows you to take control of naming your Java enum constants and avoid relying on auto-generated names.

	If your schema includes javaEnumNames like:

	{
	    "type" : "object",
	    "properties" : {
	        "foo" : {
	            "type" : "string",
	            "enum" : ["H","L"],
	            "javaEnumNames" : ["HIGH","LOW"]
	        }
	    }
	}
	Then you'll see a generated type like:

	public enum Foo {
	    HIGH("H"),
	    LOW("L");
	    ...
	}
	javaEnums
	NOTE: You must only use one of javaEnumNames or javaEnums, the later being a more robust extension.

	Any schema that makes use of enum may include javaEnums. This property allows you to take control of naming your Java enum constants and avoid relying on auto-generated names and add per-enum constant documentation with title and description.

	If your schema includes javaEnumNames like:

	{
		"$id": "https://cubrc.org/rigors/schemas/common/com/examples/Digits.schema.json",
		"$schema": "http://json-schema.org/draft-07/schema#",
		"type": "string",
		"enum": ["1", "2", "3", "4"],
		"javaEnums": [
			{
				"name": "ONE",
				"title": "The first number.",
				"description": "1 (one, also called unit, unity, and (multiplicative) identity) is a number, and a numerical digit used to represent that number in numerals. (https://en.wikipedia.org/wiki/1)"
			},
			{
				"name": "TWO",
				"title": "The second number.",
				"description": "2 (two) is a number, numeral, and glyph. \n\nIt is the natural number following 1 and preceding 3. (https://en.wikipedia.org/wiki/2)"
			}, {
				"name": "THREE",
				"title": "The third number.",
				"description": "3 (three) is a number, numeral, and glyph. It is the natural number following 2 and preceding 4. (https://en.wikipedia.org/wiki/3)"
			}, {
				"name": "FOUR",
				"title": "The fourth number.",
				"description": "4 (four) is a number, numeral, and glyph. It is the natural number following 3 and preceding 5. (https://en.wikipedia.org/wiki/4)"
			}
		],
		"additionalProperties": false,
		"required": [],
		"definitions": {}
	}
	Then you'll see a generated type like:

	public enum Digits {

	    /**
	     * The first number.
	     * <p>
	     *  1 (one, also called unit, unity, and (multiplicative) identity) is a number, and a numerical digit used to represent that number in numerals. (https://en.wikipedia.org/wiki/1)
	     * 
	     */
	    ONE("1"),

	    /**
	     * The second number.
	     * <p>
	     *  2 (two) is a number, numeral, and glyph. 
	     * 
	     * It is the natural number following 1 and preceding 3. (https://en.wikipedia.org/wiki/2)
	     * 
	     */
	    TWO("2"),

	    /**
	     * The third number.
	     * <p>
	     *  3 (three) is a number, numeral, and glyph. It is the natural number following 2 and preceding 4. (https://en.wikipedia.org/wiki/3)
	     * 
	     */
	    THREE("3"),

	    /**
	     * The fourth number.
	     * <p>
	     *  4 (four) is a number, numeral, and glyph. It is the natural number following 3 and preceding 5. (https://en.wikipedia.org/wiki/4)
	     * 
	     */
	    FOUR("4");
	    ...
	}
	javaInterfaces
	Any schema may include a javaInterfaces property, the value of this property is an array of strings. Each string is expected to contain the fully-qualified name of a Java interface. The Java type generated by the schema will implement all the given interfaces.

	If the javaInterfaces property is added to fooBar.json like:

	{
	    "javaInterfaces" : ["java.io.Serializable", "Cloneable"],
	    "type" : "object"
	}
	then the result will be a class defined like:

	public class FooBar implements Serializable, Cloneable
	{
	...
	javaJsonView
	Any schema may include a javaJsonView property, the value of the property is a fully qualified class name. The property causes a @JsonView annotation to be added to the member with the given class for a value. This only works for Jackson-based annotators. It is supported for v1 and v2 Jackson. See Jackson Annotations.

	If javaJsonView is added to fooBar.json schema as follows:

	{
	  "type": "object",
	  "properties": {
	     "internalStatus": {
	         "javaJsonView": "com.example.views.Internal",
	         "type": "string"
	     }
	  }
	}
	Then the resulting FooBar.java will have:

	import com.example.views.Internal;

	public class FooBar {
	    @JsonView(Internal.class)
	    private String internalStatus;
	}
	javaName
	Using javaName rule allows you to define custom names for java bean properties instead of those inferred from the corresponding json property names. This also affects setters and getters.

	For example, the following schema:

	{
	  "type": "object",
	  "properties": {
	    "a": {
	      "javaName": "b",
	      "type": "string"
	    }
	  }
	}
	will produce Java code similar to the following:

	public class MyClass {
	    @JsonProperty("a")
	    private String b;

	    @JsonProperty("a")
	    public String getB() {
	        return b;
	    }

	    @JsonProperty("a")
	    public void setB(String b) {
	        this.b = b;
	    }
	}
	customPattern/customTimezone
	Set a custom format pattern for date or date-time fields that will be used during serialization (if your binding library supports it). If you're using Jackson 2 this will cause an @JsonFormat annotation to be added. For 'date-time' fields you may also set a custom timezone (if you want to use a timezone other than UTC when writing out the date-time as a string).

	{
	    "type" : "object",
	    "properties" : {
	        "dob" : {
	            "type" : "string",
	            "format" : "date",
	            "customPattern" : "yy-MM-dd"
	        },
	        "updatedDate" : {
	            "type" : "string",
	            "format" : "date-time",
	            "customDateTimePattern" : "yyyy-MM-dd'T'HH:mm:ssZ",
	            "customTimezone": "PDT"
	        }
	    }
	}
	There are two important things to note before using this extension property:

	If you set the formatDates/formatDateTimes global config options to true, you'll get default ISO-8601/RFC 3339 formatting without having to set these custom properties.
	You should be aware that setting a custom date or date-time pattern may mean that the JSON content you produce is not valid according to the rules of JSON Schema.
	excludedFromEqualsAndHashCode
	You can specify which fields should be omitted in the generated equals() and hashCode() methods using the excludedFromEqualsAndHashCode rule. These fields can be either listed in an object-level array or flagged individually.

	This option is only meaningful if equals() and hashCode() generation is enabled.

	{
	  "type": "object",
	  "excludedFromEqualsAndHashCode" : [ "excludedByArray" ],
	  "properties": {
	    "notExcluded" : {
	      "type" : "string"
	    },
	    "excludedByProperty" : {
	      "type" : "string",
	      "excludedFromEqualsAndHashCode" : true
	    }
	}
	In the above example, only notExcluded will be inlcuded in equals() and hashCode().

	© 2012-2018 Joe Littlejohn





}
