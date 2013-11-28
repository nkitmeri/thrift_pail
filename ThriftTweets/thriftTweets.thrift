namespace java thrift.tweets

enum TweetType
{
	TWEET = 1,
	RETWEET = 2
}

struct Text
{
    1:  required string orignalText;
    2:  optional string cleanText;
}

struct Location
{
    1:  required double latitude;
    2:  required double longitude; 
}

struct User
{
    1:  required i64 userId;
    2:  optional string name;
    3:  optional string screen_name;
    4:  optional Location location;
    5:  optional string createdAt;
    6:  optional string description;
    7:  optional bool isVerified;
}

struct URLEntity
{
    1:  required string url;
    2:  optional string displayUrl;
    3:  optional string expandedUrl;
    4:  optional string accessedUrl;
}

struct MentionEntity
{
    1:  i64 id;
    2:  optional string name;
    3:  optional string screen_name;  
}

struct HashtagEntity
{
    1:  required string hashtag;
}

// NER from OpenNLP, to the clean text
struct NamedEntity
{
    1:  required string nameEntity;
}

struct Language
{
    1:  optional string getLang;
}

struct Date
{
    1:  required string cratedAt;
}

typedef list<URLEntity> URLEntities
typedef list<MentionEntity> MentionEntities
typedef list<HashtagEntity> HashtagEntities
typedef list<NamedEntity> NamedEntities

struct Tweet
{
    1:  required i64 id;
    2:  required User user;
    3:  required TweetType type;
    4:  required Date date;
    6:  optional Text text;
    7:  optional URLEntities urlEntities;
    8:  optional MentionEntities mentionEntities;
    9:  optional HashtagEntities hashtagEntities;
    10: optional NamedEntities namedEntities;
    11: optional Language language;
} 