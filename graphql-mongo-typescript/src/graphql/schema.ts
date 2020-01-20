import { GraphQLSchema } from "graphql";
import { RootQueryType } from "./RootQueryType";

export const Schema = new GraphQLSchema({
    query: RootQueryType,
    // mutation: RootMutationType,
    // subscription: RootSubscriptionType
});
