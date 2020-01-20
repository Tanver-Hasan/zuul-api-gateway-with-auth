import { GraphQLInt, GraphQLObjectType, GraphQLString } from "graphql";

export const IProductType = new GraphQLObjectType({
    name: "IProductType",
    fields: {
        _id: { type: GraphQLString },
        title: { type: GraphQLString },
        category: { type: GraphQLString },
        price: { type: GraphQLInt},
        ratings: { type: GraphQLInt },
        sku: { type: GraphQLString },
    },
});
